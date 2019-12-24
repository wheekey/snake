package com.wheekey.snake.services;

import com.wheekey.snake.entities.Field;
import com.wheekey.snake.entities.Snake;
import com.wheekey.snake.valueobjects.Coordinates;

import java.util.ArrayList;
import java.util.Random;

public class FieldService {
    private Field field;

    public FieldService(Field field) {
        this.field = field;
    }

    public boolean isAlreadyFilledField() {
        int fieldSizeOneSide = field.getCoordinates().length;
        int[][] fieldCoords = field.getCoordinates();
        for (int x = 0; x < fieldSizeOneSide; x++) {
            for (int y = 0; y < fieldSizeOneSide; y++) {
                if (fieldCoords[x][y] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isAlreadyExistPlantFeedOnField() {
        int fieldSizeOneSide = field.getCoordinates().length;
        int[][] fieldCoords = field.getCoordinates();
        for (int x = 0; x < fieldSizeOneSide; x++) {
            for (int y = 0; y < fieldSizeOneSide; y++) {
                if (fieldCoords[x][y] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void plantFeed(Coordinates coordinates) {
        field.getCoordinates()[coordinates.x][coordinates.y] = -1;
    }

    public Coordinates getRandomEmptyFieldCoordinates() {
        ArrayList<Coordinates> emptyFieldCoordinates = getEmptyFieldCoordinates();

        return emptyFieldCoordinates.get(new Random().nextInt(emptyFieldCoordinates.size()));
    }


    public ArrayList<Coordinates> getEmptyFieldCoordinates() {
        ArrayList<Coordinates> result = new ArrayList<Coordinates>();
        int fieldSizeOneSide = field.getCoordinates().length;
        int[][] fieldCoords = field.getCoordinates();

        for (int x = 0; x < fieldSizeOneSide; x++) {
            for (int y = 0; y < fieldSizeOneSide; y++) {
                if (fieldCoords[x][y] == 0) {
                    result.add(new Coordinates(x, y));
                }
            }
        }

        return result;
    }

}
