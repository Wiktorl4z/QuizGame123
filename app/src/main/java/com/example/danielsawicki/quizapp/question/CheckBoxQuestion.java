package com.example.danielsawicki.quizapp.question;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxQuestion extends Question {

    private List<String> answers;

    public CheckBoxQuestion(int intImage, String question, String... correctAnswers) {
        super(intImage, question, correctAnswers);
        answers = new ArrayList<>();
    }

    @Override
    public String getAnswer() {
        return null;
    }

    @Override
    public String getAnswer(int i) {
        return answers.get(i - 1);
    }

    public void addSelection(String selection2) {
        answers.add(selection2);
    }

    public List<String> getQuestions() {
        return answers;
    }

}

