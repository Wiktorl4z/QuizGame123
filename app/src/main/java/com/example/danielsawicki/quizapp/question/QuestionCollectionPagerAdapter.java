package com.example.danielsawicki.quizapp.question;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class QuestionCollectionPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Question> questions;

    public QuestionCollectionPagerAdapter(FragmentManager fm, List<Question> questions) {
        super(fm);
        this.questions = questions;
    }

    @Override
    public Fragment getItem(int i) {
        Question q = questions.get(i);
        QuestionFragment fragment = new QuestionFragment();
        fragment.setQuestion(q);
        if (i == getCount() - 1) {
            fragment.setLastQuestion(true);
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return questions.size();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "QUESTION " + (position + 1);
    }
}