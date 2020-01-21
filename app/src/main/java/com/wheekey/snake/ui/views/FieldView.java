package com.wheekey.snake.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.core.view.MotionEventCompat;

import com.wheekey.snake.entities.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FieldView extends View {

    Paint paint = new Paint();
    public static Canvas mCanvas;


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

    public void redraw(List<Point> points, Point feedPoint) {
        //important. Refreshes the view by calling onDraw function
        this.points = points;
        invalidate();

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