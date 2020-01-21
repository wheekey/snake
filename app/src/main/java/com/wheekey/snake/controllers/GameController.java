package com.wheekey.snake.controllers;


import android.content.Context;
import android.widget.Toast;

import com.wheekey.snake.DirectionEnum;
import com.wheekey.snake.OnSwipeTouchListener;
import com.wheekey.snake.entities.Field;
import com.wheekey.snake.entities.Point;
import com.wheekey.snake.listeners.SwipeControllerInterface;
import com.wheekey.snake.ui.views.FieldView;

import java.util.ArrayList;
import java.util.List;

/**
 * This class make changes to the view when user make swipe
 *
 */
public class GameController implements SwipeControllerInterface {

    private Context context;
    private FieldView fieldView;
    private FieldController fieldController;
    private List<Point> pointList = new ArrayList<>();

    {
        this.pointList.add(new Point(0,0,40, 40));
        this.pointList.add(new Point(40,0,80, 40));
        this.pointList.add(new Point(80,0,120, 40));
    }


    public GameController(Context context, FieldView fieldView, FieldController fieldController) {
        this.context = context;
        this.fieldView = fieldView;
        this.fieldController = fieldController;
    }

    public void start()
    {
        fieldController.redrawPoints(pointList, fieldView);
    }

    public void end()
    {

    }


    @Override
    public void changeDirection(DirectionEnum directionEnum) {
        Toast.makeText(context, "Swiped " + directionEnum.toString(), Toast.LENGTH_SHORT).show();

        fieldController.movePoints(pointList, directionEnum);
        fieldController.redrawPoints(pointList, fieldView);

    }
}
