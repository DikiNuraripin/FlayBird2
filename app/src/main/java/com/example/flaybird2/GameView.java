package com.example.flaybird2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.google.android.material.canvas.CanvasCompat;

import java.util.ArrayList;

public class GameView extends View {
    private Bird bird;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bird = new Bird();
        bird.setWidth(100*Constans.SCREEN_WIDTH/100);
        bird.setHeight(100*Constans.SCREEN_HEIGHT/1920);
        bird.setX(100*Constans.SCREEN_WIDTH/1080);
        bird.setY(100*Constans.SCREEN_HEIGHT/2-bird.getHeight()/2);
        ArrayList<Bitmap> arrBms = new ArrayList<>();
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.bird2));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.bird2));
        bird.setArrBms(arrBms);
    }
    public void draw (Canvas canvas){
        super.draw(canvas);
        bird.draw(canvas);
    }
}
