package com.example.danielsawicki.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.danielsawicki.quizapp.R;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }

    public void onImageClick(View view) {
        Intent mainActivity = new Intent(this, MainMenu.class);
        startActivity(mainActivity);
    }
}
