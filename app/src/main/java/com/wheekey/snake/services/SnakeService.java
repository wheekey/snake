package com.wheekey.snake.services;

import com.wheekey.snake.entities.Snake;
import com.wheekey.snake.valueobjects.SnakeBodyPartCoordinates;

import java.util.ArrayList;

public class SnakeService {

    public void addBodyPart(Snake snake, SnakeBodyPartCoordinates newSnakeBodyPartCoordinates) {
        ArrayList<SnakeBodyPartCoordinates> snakeBodyPartCoordinatesList = snake.getSnakeBodyPartCoordinatesList();

        for (SnakeBodyPartCoordinates snakeBodyPartCoordinates : snakeBodyPartCoordinatesList) {
            snakeBodyPartCoordinates.incrementBodyPartCoordinates();
        }
        snakeBodyPartCoordinatesList.add(newSnakeBodyPartCoordinates);
    }

}
