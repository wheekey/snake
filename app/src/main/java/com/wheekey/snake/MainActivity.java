package com.wheekey.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.wheekey.snake.controllers.FieldController;
import com.wheekey.snake.controllers.GameController;
import com.wheekey.snake.entities.Point;
import com.wheekey.snake.services.FieldService;
import com.wheekey.snake.ui.views.FieldView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    GameController gameController;
    FieldController fieldController;
    OnSwipeTouchListener onSwipeTouchListener;
    FieldView fieldView;

    private List<Point> pointList = new ArrayList<>();

    {
        this.pointList.add(new Point(0, 0, 40, 40));
        this.pointList.add(new Point(40, 0, 80, 40));
        this.pointList.add(new Point(80, 0, 120, 40));
    }

    int fieldSizePx = 400;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fieldController = new FieldController(new FieldService());
        gameController = new GameController(this, fieldView, fieldController, pointList, DirectionEnum.RIGHT);

        fieldView = findViewById(R.id.fieldView);
        fieldView.setPoints(this.pointList);
        runSnake();

        onSwipeTouchListener = new OnSwipeTouchListener(this, fieldView, gameController);
    }

    private void runSnake()
    {
        final Handler handler = new Handler(Looper.getMainLooper());
        Runnable snakeMove= new Runnable(){
            public void run(){

                System.out.println(gameController.getDirectionEnum());
                fieldController.moveSnake(pointList, gameController.getDirectionEnum());
                //fieldController.redrawPoints(pointList, fieldView);
                fieldView.invalidate(); //will trigger the onDraw
                handler.postDelayed(this,1000); //in 5 sec player0 will move again
            }
        };
        snakeMove.run();
    }

}


