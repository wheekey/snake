package com.wheekey.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wheekey.snake.listeners.SwipeController;

public class MainActivity extends AppCompatActivity {

    SwipeController swipeController;
    OnSwipeTouchListener onSwipeTouchListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeController = new SwipeController(this);
        onSwipeTouchListener = new OnSwipeTouchListener(this, findViewById(R.id.fieldView), swipeController);



    }
}
