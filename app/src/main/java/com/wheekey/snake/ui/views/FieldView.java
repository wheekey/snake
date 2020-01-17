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

import java.util.concurrent.TimeUnit;

public class FieldView extends View {

    Paint paint = new Paint();
    public static Canvas mCanvas;


    private int left = 0;
    private int top = 0;
    private int right = 40;
    private int bottom = 40;

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

    public void drawCircle() {
        this.right = 80;
        this.bottom = 80;


        //important. Refreshes the view by calling onDraw function
        invalidate();

    }



    protected void onDraw(Canvas canvas) {
        mCanvas = canvas;
        super.onDraw(mCanvas);


        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);

        mCanvas.drawRect(this.left, this.top, this.right, this.bottom, paint);


    }



}