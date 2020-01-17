package com.wheekey.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wheekey.snake.listeners.SwipeController;
import com.wheekey.snake.ui.views.FieldView;

public class MainActivity extends AppCompatActivity {

    SwipeController swipeController;
    OnSwipeTouchListener onSwipeTouchListener;
    FieldView fieldView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fieldView = findViewById(R.id.fieldView);
        swipeController = new SwipeController(this, fieldView);


        onSwipeTouchListener = new OnSwipeTouchListener(this, fieldView, swipeController);



    }
}
