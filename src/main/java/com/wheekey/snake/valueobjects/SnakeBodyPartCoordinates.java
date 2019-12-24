package com.wheekey.snake.valueobjects;

public class SnakeBodyPartCoordinates extends Coordinates {

    private int bodyPartId;

    public SnakeBodyPartCoordinates(int bodyPartId, int x, int y) {
        super(x, y);
        this.bodyPartId = bodyPartId;
    }

    public int getBodyPartId() {
        return bodyPartId;
    }

    public void incrementBodyPartCoordinates() {
        this.bodyPartId++;
    }
}
