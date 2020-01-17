package com.wheekey.snake.listeners;


import android.content.Context;
import android.widget.Toast;

import com.wheekey.snake.OnSwipeTouchListener;

/**
 * This class make changes to the view when user make swipe
 *
 */
public class SwipeController implements SwipeControllerInterface {

    private Context context;

    public SwipeController(Context context) {

        this.context = context;
    }

    @Override
    public void swipeRight() {
        Toast.makeText(context, "Swiped Right", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void swipeTop() {
        Toast.makeText(context, "Swiped Up", Toast.LENGTH_SHORT).show();
        ;
    }

    @Override
    public void swipeBottom() {
        Toast.makeText(context, "Swiped Down", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void swipeLeft() {
        Toast.makeText(context, "Swiped Left", Toast.LENGTH_SHORT).show();
    }
}
