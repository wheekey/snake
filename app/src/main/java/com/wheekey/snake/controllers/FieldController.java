package com.wheekey.snake.controllers;

import com.wheekey.snake.DirectionEnum;
import com.wheekey.snake.entities.Point;
import com.wheekey.snake.services.FieldService;
import com.wheekey.snake.ui.views.FieldView;

import java.util.List;

public class FieldController {

    private final FieldService fieldService;

    public FieldController(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    public void redrawPoints(List<Point> pointList, FieldView fieldView)
    {
        fieldView.redraw(pointList, new Point(80,0,120, 40));
    }

    public void movePoints(List<Point> pointList, DirectionEnum directionEnum)
    {

        fieldService.recalculatePoints(pointList, directionEnum);
    }
}
