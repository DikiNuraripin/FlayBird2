package com.example.flaybird2;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class BaseObject {
    protected float x, y;
    protected int width, height;
    protected Rect rect;
    protected Bitmap bm;

    public BaseObject(float x, float y, int width, int height,Rect rect, Bitmap bm) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rect = rect;
        this.bm = bm;
    }

    public BaseObject() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rect getRect() {
        return new Rect((int)this.x,(int)this.y,(int)this.x+this.width,(int) this.y+this.height);
    }

    public void setRect(Rect rect) {
        this.rect = rect;
    }

    public Bitmap getBm() {
        return bm;
    }

    public void setBm(Bitmap bm) {
        this.bm = bm;
    }
}
