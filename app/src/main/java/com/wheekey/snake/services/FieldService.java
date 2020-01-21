package com.wheekey.snake.services;

import com.wheekey.snake.DirectionEnum;
import com.wheekey.snake.entities.Field;
import com.wheekey.snake.entities.Point;
import com.wheekey.snake.entities.Snake;
import com.wheekey.snake.ui.views.FieldView;
import com.wheekey.snake.valueobjects.Coordinates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FieldService {
/*    private Field field;

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

    */

    int fieldSize = 400;
    int pointSize = 40;

    public void recalculatePoints(List<Point> pointList, DirectionEnum directionEnum) {
        this.moveTail(pointList);

        int lastPointIndex = pointList.size() - 1;
        Point newHead = this.generateNewHead(pointList.get(pointList.size() - 1), directionEnum);
        Point oldHead = pointList.get(lastPointIndex);
        oldHead.setLeft(newHead.getLeft());
        oldHead.setTop(newHead.getTop());
        oldHead.setRight(newHead.getRight());
        oldHead.setBottom(newHead.getBottom());

    }

    public Point generateNewHead(Point oldHead, DirectionEnum directionEnum) {
        int left = oldHead.getLeft();
        int top = oldHead.getTop();
        int right = oldHead.getRight();
        int bottom = oldHead.getBottom();

        if (directionEnum.equals(DirectionEnum.LEFT)) {
            if (left == 0) {
                left = this.fieldSize - pointSize;
                right = this.fieldSize;
            } else {
                left = oldHead.getLeft() - this.pointSize;
                right = oldHead.getRight() - this.pointSize;
            }
        } else if (directionEnum.equals(DirectionEnum.TOP)) {
            if (top == 0) {
                top = this.fieldSize - pointSize;
                bottom = this.fieldSize;
            } else {
                top = oldHead.getTop() - this.pointSize;
                bottom = oldHead.getBottom() - this.pointSize;
            }
        } else if (directionEnum.equals(DirectionEnum.RIGHT)) {
            if (right == this.fieldSize) {
                left = 0;
                right = this.pointSize;
            } else {
                left = oldHead.getLeft() + this.pointSize;
                right = oldHead.getRight() + this.pointSize;
            }


        } else if (directionEnum.equals(DirectionEnum.BOTTOM)) {
            if (bottom == this.fieldSize) {
                top = 0;
                bottom = this.pointSize;
            } else {
                top = oldHead.getTop() + this.pointSize;
                bottom = oldHead.getBottom() + this.pointSize;
            }

        }

        return new Point(left, top, right, bottom);
    }

    public void moveTail(List<Point> pointList) {
        for (int i = 0; i < pointList.size() - 1; i++) {
            Point point = pointList.get(i);
            Point pointNext = pointList.get(i + 1);
            point.setTop(pointNext.getTop());
            point.setLeft(pointNext.getLeft());
            point.setBottom(pointNext.getBottom());
            point.setRight(pointNext.getRight());
        }
    }


    public void generateNewFeedPoint(List<Point> pointList, DirectionEnum directionEnum) {

    }

    public boolean isSnakeEatedAFeed(List<Point> pointList, DirectionEnum directionEnum) {
        return true;
    }

    public boolean isGameOver(List<Point> pointList, DirectionEnum directionEnum) {
        return true;
    }

    public boolean isSnakeCorrupted(List<Point> pointList, DirectionEnum directionEnum) {
        return true;
    }

    public Point getFeedPoint(List<Point> pointList, DirectionEnum directionEnum) {
        return null;
    }

    public Point getNextSnakeMovePoint(List<Point> pointList, DirectionEnum directionEnum) {
        return null;
    }

}
