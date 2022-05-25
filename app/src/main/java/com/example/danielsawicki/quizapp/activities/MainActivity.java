package com.example.danielsawicki.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.danielsawicki.quizapp.question.CheckBoxQuestion;
import com.example.danielsawicki.quizapp.question.EntryQuestion;
import com.example.danielsawicki.quizapp.question.QuestionCollectionPagerAdapter;
import com.example.danielsawicki.quizapp.R;
import com.example.danielsawicki.quizapp.question.Question;
import com.example.danielsawicki.quizapp.question.RadioButtonQuestion;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String QUESTIONS_INTENT = "questions";
    private QuestionCollectionPagerAdapter mQuestionCollectionPagerAdapter;
    private ViewPager mViewPager;
    private static final List<Question> FAKE_CHAMPIONS_QUESTION = new ArrayList<>();
    private static final List<Question> FAKE_ITEM_QUESTION = new ArrayList<>();
    private static final List<Question> FAKE_SPELLS_QUESTION = new ArrayList<>();
    private static MainActivity instance;
    public static final String PRESSED_BUTTON_KEY = "mainMenuButton";
    String userName;


    static {
        RadioButtonQuestion questions = new RadioButtonQuestion(R.drawable.jhin, "What's the name of the champion?", "Jhin");
        questions.addSelection("Graves");
        questions.addSelection("Jhin");
        questions.addSelection("Vayne");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.katarina, "What's the name of the champion?", "Katarina");
        questions.addSelection("Katarina");
        questions.addSelection("Lux");
        questions.addSelection("Diana");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.rengar, "What's the name of the champion?", "Rengar");
        questions.addSelection("Darius");
        questions.addSelection("Rengar");
        questions.addSelection("Ezreal");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.yasuo, "What's the name of the champion?", "Yasuo");
        questions.addSelection("Yasuo");
        questions.addSelection("Yorick");
        questions.addSelection("Zed");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.ahri, "What's the name of the champion?", "Ahri");
        questions.addSelection("Ahri");
        questions.addSelection("Zyra");
        questions.addSelection("Tristana");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.aurelio_sol, "What's the name of the champion?", "Aurelion Sol");
        questions.addSelection("Cassiopeia");
        questions.addSelection("Camille");
        questions.addSelection("Aurelion Sol");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.ashe, "What's the name of the champion?", "Ashe");
        questions.addSelection("Ashe");
        questions.addSelection("Caitlyn");
        questions.addSelection("Akali");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.kog_maw, "What's the name of the champion?", "Kog'Maw");
        questions.addSelection("Malphite");
        questions.addSelection("Kog'Maw");
        questions.addSelection("Nautilus");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.galio, "What's the name of the champion?", "Galio");
        questions.addSelection("Kled");
        questions.addSelection("Galio");
        questions.addSelection("Mordekaiser");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.talon, "What's the name of the champion?", "Talon");
        questions.addSelection("Olaf");
        questions.addSelection("Nasus");
        questions.addSelection("Talon");
        FAKE_CHAMPIONS_QUESTION.add(questions);

        CheckBoxQuestion checkBoxQuestion = new CheckBoxQuestion(R.drawable.demacia, "Which champions are from Demacia", "Jarvan IV", "Xin Zao");
        checkBoxQuestion.addSelection("Vayne");
        checkBoxQuestion.addSelection("Jarvan IV");
        checkBoxQuestion.addSelection("Zed");
        checkBoxQuestion.addSelection("Xin Zao");
        FAKE_CHAMPIONS_QUESTION.add(checkBoxQuestion);

        EntryQuestion entryQuestion = new EntryQuestion(R.drawable.annie, "What's the name of the champion?", "annie");
        FAKE_CHAMPIONS_QUESTION.add(entryQuestion);
    }

    static {
        RadioButtonQuestion questions = new RadioButtonQuestion(R.drawable.zonia, "What's the name of the Item?", "Zhonya's Hourglass");
        questions.addSelection("Zz'Rot Portal");
        questions.addSelection("Zhonya's Hourglass");
        questions.addSelection("Zeke's Harbinger");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.frozen, "What's the name of the Item?", "Frozen Mallet");
        questions.addSelection("Frozen Heart");
        questions.addSelection("Frozen Hammer");
        questions.addSelection("Frozen Mallet");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.seraph100, "What's the name of the Item?", "Seraph's Embrace");
        questions.addSelection("Seraph's Embrace");
        questions.addSelection("Serrated Dirk");
        questions.addSelection("Sheen");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.meja, "What's the name of the Item?", "Mejai's Soulstealer");
        questions.addSelection("Mercurial Scimitar");
        questions.addSelection("Mikael's Crucible");
        questions.addSelection("Mejai's Soulstealer");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.crystal_scepte, "What's the name of the Item?", "Rylai's Crystal Scepter");
        questions.addSelection("Seeker's Armguard");
        questions.addSelection("Rylai's Crystal Scepter");
        questions.addSelection("Redemption");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.gunblade, "What's the name of the Item?", "Hextech Gunblade");
        questions.addSelection("Iceborn Gauntlet");
        questions.addSelection("Kircheis Shard");
        questions.addSelection("Hextech Gunblade");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.hexdrinker, "What's the name of the Item?", "Hexdrinker");
        questions.addSelection("Hexdrinker");
        questions.addSelection("Last Whisper");
        questions.addSelection("Lich Bane");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.hunter_potion, "What's the name of the Item?", "Hunter's Potion");
        questions.addSelection("Hunter's Potion");
        questions.addSelection("Health Potion");
        questions.addSelection("Refillable Potion");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.void_staff, "What's the name of the Item?", "Void Staff");
        questions.addSelection("Archangel's Staff");
        questions.addSelection("Void Staff");
        questions.addSelection("Vanguard Banner");
        FAKE_ITEM_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.wrath, "What's the name of the Item?", "Elixir of Wrath");
        questions.addSelection("Elixir of Iron");
        questions.addSelection("Elixir of Sorcery");
        questions.addSelection("Elixir of Wrath");
        FAKE_ITEM_QUESTION.add(questions);

        CheckBoxQuestion checkBoxQuestion = new CheckBoxQuestion(R.drawable.spellvamp, "Which of those items have spellvamp", "Hextech Gunblade", "Maw of Malmortius");
        checkBoxQuestion.addSelection("Hextech Gunblade");
        checkBoxQuestion.addSelection("Infinity Edge");
        checkBoxQuestion.addSelection("Essence Reaver");
        checkBoxQuestion.addSelection("Maw of Malmortius");
        FAKE_ITEM_QUESTION.add(checkBoxQuestion);

        EntryQuestion entryQuestion = new EntryQuestion(R.drawable.phantom_dancer, "What's the name of the Item?", "phantom dancer");
        FAKE_ITEM_QUESTION.add(entryQuestion);
    }

    static {
        RadioButtonQuestion questions = new RadioButtonQuestion(R.drawable.ignite, "What's the name of the spell?", "Ignite");
        questions.addSelection("Ignite");
        questions.addSelection("Exhaust");
        questions.addSelection("Smite");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.heal, "What's the name of the spell?", "Heal");
        questions.addSelection("Mark");
        questions.addSelection("Heal");
        questions.addSelection("Dash");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.smite, "What's the name of the spell?", "Smite");
        questions.addSelection("Smite");
        questions.addSelection("Flash");
        questions.addSelection("Cleanse");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.dash, "What's the name of the spell?", "Dash");
        questions.addSelection("Teleport");
        questions.addSelection("Ghost");
        questions.addSelection("Dash");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.teleport, "What's the name of the spell?", "Teleport");
        questions.addSelection("Dash");
        questions.addSelection("Teleport");
        questions.addSelection("Mark");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.exhaust, "What's the name of the spell?", "Exhaust");
        questions.addSelection("Ignite");
        questions.addSelection("Clarity");
        questions.addSelection("Exhaust");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.flash, "What's the name of the spell?", "Flash");
        questions.addSelection("Cleanse");
        questions.addSelection("Teleport");
        questions.addSelection("Flash");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.mark, "What's the name of the spell?", "Mark");
        questions.addSelection("Mark");
        questions.addSelection("Ghost");
        questions.addSelection("Clarity");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.ghost, "What's the name of the spell?", "Ghost");
        questions.addSelection("Smite");
        questions.addSelection("Ghost");
        questions.addSelection("Cleanse");
        FAKE_SPELLS_QUESTION.add(questions);

        questions = new RadioButtonQuestion(R.drawable.cleanse, "What's the name of the spell?", "Cleanse");
        questions.addSelection("Exhaust");
        questions.addSelection("Clarity");
        questions.addSelection("Cleanse");
        FAKE_SPELLS_QUESTION.add(questions);

        CheckBoxQuestion checkBoxQuestion = new CheckBoxQuestion(R.drawable.aram, "Which spells can you use on ARAM?", "Flash", "Ghost", "Mark");
        checkBoxQuestion.addSelection("Flash");
        checkBoxQuestion.addSelection("Teleport");
        checkBoxQuestion.addSelection("Ghost");
        checkBoxQuestion.addSelection("Mark");
        FAKE_SPELLS_QUESTION.add(checkBoxQuestion);

        EntryQuestion entryQuestion = new EntryQuestion(R.drawable.clairvoyance, "Can you write name of this spell?", "clairvoyance");
        FAKE_SPELLS_QUESTION.add(entryQuestion);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;

        userName = getIntent().getExtras().getString(MainMenu.KOX);
        setContentView(R.layout.activity_main);
        byte b = getIntent().getExtras().getByte(PRESSED_BUTTON_KEY);
        switch (b) {
            case 0:
                mQuestionCollectionPagerAdapter = new QuestionCollectionPagerAdapter(getSupportFragmentManager(), FAKE_CHAMPIONS_QUESTION);
                break;
            case 1:
                mQuestionCollectionPagerAdapter = new QuestionCollectionPagerAdapter(getSupportFragmentManager(), FAKE_ITEM_QUESTION);
                break;
            case 2:
                mQuestionCollectionPagerAdapter = new QuestionCollectionPagerAdapter(getSupportFragmentManager(), FAKE_SPELLS_QUESTION);
                break;
        }
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mQuestionCollectionPagerAdapter);
    }

    /**
     * The {@link ViewPager} that will display the object collection.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public static MainActivity getInstance() {
        return instance;
    }

    public void showFinalScreen() {
        Intent mFinal = new Intent(this, FinalScreenActivity.class);
        mFinal.putExtra(MainMenu.KOX, userName);

        List<Question> questions = mQuestionCollectionPagerAdapter.getQuestions();
        ArrayList<String> list = new ArrayList<String>();
        int answered = 0;
        int correct = 0;
        int all = questions.size();

        for (Question q : questions) {
            if (q.isAnswered()) {
                answered++;
            }
            if (q.isAnsweredCorrect()) {
                correct++;
            }
            q.setAnswered(false);
            q.setAnsweredCorrect(false);
        }

        String image;
        if (correct == all) {
            image = "challenger";
        } else if (correct > all - 2) {
            image = "diamond";
        } else if (correct > all - 3) {
            image = "platinum";
        } else if (correct > all / 2) {
            image = "gold";
        } else if (correct > all / 4) {
            image = "bronse";
        } else {
            image = "silver";
        }

        list.add("You answered " + correct + " / " + all + " correctly.");
        list.add(image);
        mFinal.putStringArrayListExtra(QUESTIONS_INTENT, list);
        startActivity(mFinal);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
