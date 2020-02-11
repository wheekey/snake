package com.wheekey.snake.entities;

import com.wheekey.snake.DirectionEnum;
import com.wheekey.snake.valueobjects.SnakeBodyPartCoordinates;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<Point> points;
    private DirectionEnum directionEnum;

    public Snake(List<Point> points, DirectionEnum directionEnum) {
        this.points = points;
        this.directionEnum = directionEnum;
    }

    public List<Point> getPoints() {
        return points;
    }


}
