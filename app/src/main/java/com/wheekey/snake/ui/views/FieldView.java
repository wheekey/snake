package com.wheekey.snake.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.wheekey.snake.controllers.FieldController;
import com.wheekey.snake.entities.Point;

import java.util.ArrayList;
import java.util.List;

public class FieldView extends View {

    Paint paint = new Paint();
    public static Canvas mCanvas;
    private FieldController fieldController;

    private List<Point> points = new ArrayList<>();

    private static final String DEBUG_TAG = "FieldView";

    public FieldView(Context context) {
        super(context);
    }

    public FieldView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FieldView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    protected void onDraw(Canvas canvas) {
        mCanvas = canvas;
        super.onDraw(mCanvas);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);

        for(Point point:points){
            mCanvas.drawRect(point.getLeft(), point.getTop(), point.getRight(), point.getBottom(), paint);
        }
    }






}