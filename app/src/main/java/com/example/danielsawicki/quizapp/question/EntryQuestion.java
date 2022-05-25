package com.example.danielsawicki.quizapp.question;

public class EntryQuestion extends Question {
    public EntryQuestion(int intImage, String mProblem, String correctAnswer) {
        super(intImage, mProblem, correctAnswer);
    }

    @Override
    public String getAnswer() {
        return getCorrectAnswer();
    }

    @Override
    public String getAnswer(int i) {
        return null;
    }
}
