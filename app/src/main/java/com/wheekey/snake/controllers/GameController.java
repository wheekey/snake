package com.wheekey.snake.controllers;


import android.content.Context;
import com.wheekey.snake.DirectionEnum;
import com.wheekey.snake.entities.Point;
import com.wheekey.snake.listeners.SwipeControllerInterface;
import com.wheekey.snake.ui.views.FieldView;

import java.util.List;

/**
 * This class make changes to the view when user make swipe
 *
 */
public class GameController implements SwipeControllerInterface {

    private Context context;
    private FieldView fieldView;
    private FieldController fieldController;
    private List<Point> pointList;
    private DirectionEnum directionEnum;


    public DirectionEnum getDirectionEnum() {
        return directionEnum;
    }

    public GameController(Context context, FieldView fieldView, FieldController fieldController, List<Point> pointList, DirectionEnum directionEnum) {
        this.context = context;
        this.fieldView = fieldView;
        this.fieldController = fieldController;
        this.pointList = pointList;
        this.directionEnum = directionEnum;
    }

    @Override
    public void changeDirection(DirectionEnum newDirection) {
        this.directionEnum = newDirection;
        System.out.println(newDirection.toString());
    }
}
