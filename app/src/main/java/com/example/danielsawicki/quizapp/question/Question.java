package com.example.danielsawicki.quizapp.question;

import java.io.Serializable;

public abstract class Question implements Serializable {

    private int mImageRes;
    private String mQuestion;
    private String[] correctAnswers;
    private boolean answered;
    private boolean answeredCorrect;
    private int answer;

    public Question(int intImage, String mQuestion, String... correctAnswers) {
        mImageRes = intImage;
        this.correctAnswers = correctAnswers;
        this.mQuestion = mQuestion;
    }

    public boolean isAnsweredCorrect() {
        return answeredCorrect;
    }

    public void setAnsweredCorrect(boolean answeredCorrect) {
        this.answeredCorrect = answeredCorrect;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public int getResImage() {
        return mImageRes;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswers[0];
    }

    public abstract String getAnswer();

    public abstract String getAnswer(int i);

    public String[] getCorrectAnswers(){
        return correctAnswers;
    }
}
