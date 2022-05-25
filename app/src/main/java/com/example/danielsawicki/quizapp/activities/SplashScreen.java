package com.example.danielsawicki.quizapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.danielsawicki.quizapp.R;

public class SplashScreen extends Activity {

    private static final int CZAS = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        ActivityStarter starter = new ActivityStarter();
        starter.start();
    }

    private class ActivityStarter extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(CZAS);
            } catch (Exception e) {
                Log.e("SplashScreen", e.getMessage());
            }

            Intent intent = new Intent(SplashScreen.this, MainMenu.class);
            SplashScreen.this.startActivity(intent);
            SplashScreen.this.finish();
        }
    }
}

