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

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);

        canvas.drawRect(0, 0, 400, 80, paint);

        paint.setColor(Color.GREEN);

        canvas.drawRect(0, 300, 400, 80, paint);

    }



}