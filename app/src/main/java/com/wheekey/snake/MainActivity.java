package com.wheekey.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wheekey.snake.ui.views.CanvasDrawableView;

public class MainActivity extends AppCompatActivity {

    CanvasDrawableView canvasDrawableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvasDrawableView = new CanvasDrawableView(this);

        setContentView(canvasDrawableView);
    }
}
