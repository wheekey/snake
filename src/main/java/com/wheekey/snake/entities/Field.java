package com.wheekey.snake.entities;

public class Field {

    private int[][] coordinates;

    public Field(int fieldSize) {
        this.coordinates = new int[fieldSize][fieldSize];
    }

    public int[][] getCoordinates() {
        return coordinates;
    }

    public int getFieldSize()
    {
        return coordinates.length * 2;
    }

}
