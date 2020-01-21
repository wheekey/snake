package com.wheekey.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wheekey.snake.controllers.FieldController;
import com.wheekey.snake.controllers.GameController;
import com.wheekey.snake.services.FieldService;
import com.wheekey.snake.ui.views.FieldView;

public class MainActivity extends AppCompatActivity {

    GameController gameController ;
    FieldController fieldController;
    OnSwipeTouchListener onSwipeTouchListener;
    FieldView fieldView;


    int fieldSizePx = 400;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fieldView = findViewById(R.id.fieldView);

        fieldController = new FieldController(new FieldService());
        gameController = new GameController(this, fieldView, fieldController);


        onSwipeTouchListener = new OnSwipeTouchListener(this, fieldView, gameController);
        gameController.start();


    }
}
