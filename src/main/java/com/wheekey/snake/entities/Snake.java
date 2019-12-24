package com.wheekey.snake.entities;

import com.wheekey.snake.valueobjects.SnakeBodyPartCoordinates;

import java.util.ArrayList;

public class Snake {

    private ArrayList<SnakeBodyPartCoordinates> snakeBodyPartCoordinatesList;

    public ArrayList<SnakeBodyPartCoordinates> getSnakeBodyPartCoordinatesList() {
        return snakeBodyPartCoordinatesList;
    }

    public void setSnakeBodyPartCoordinatesList(ArrayList<SnakeBodyPartCoordinates> snakeBodyPartCoordinatesList) {
        this.snakeBodyPartCoordinatesList = snakeBodyPartCoordinatesList;
    }

    public int getSnakeSize() {
        return snakeBodyPartCoordinatesList.size();
    }
}
