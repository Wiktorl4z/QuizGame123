package com.example.danielsawicki.quizapp.question;

import java.util.ArrayList;
import java.util.List;

public class RadioButtonQuestion extends Question {

    private List<String> selection;

    public RadioButtonQuestion(int intImage, String mProblem, String correctAnswer) {
        super(intImage, mProblem, correctAnswer);
        selection = new ArrayList<>();
    }

    public void addSelection(String selection2) {
        selection.add(selection2);
    }

    public List<String> getQuestions() {
        return selection;
    }

    @Override
    public String getAnswer() {
        return null;
    }

    @Override
    public String getAnswer(int i) {
        return selection.get(i - 1);
    }
}
