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

    public void moveSnake(List<Point> pointList, DirectionEnum directionEnum)
    {
        fieldService.recalculatePoints(pointList, directionEnum);
    }
}
