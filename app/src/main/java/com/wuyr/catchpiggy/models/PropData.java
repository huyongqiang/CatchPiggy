package com.wuyr.catchpiggy.models;

import android.graphics.Canvas;
import android.os.SystemClock;

import com.wuyr.catchpiggy.customize.MyDrawable;

import java.util.Locale;

/**
 * Created by wuyr on 17-12-4 上午2:14.
 */

public class PropData {
    public MyDrawable drawable;
    public long lastUpdateTime;

    public PropData(MyDrawable drawable) {
        this.drawable = drawable;
        lastUpdateTime = SystemClock.uptimeMillis();
    }

    public void draw(Canvas canvas) {
        drawable.draw(canvas);
    }

    public float getX() {
        return drawable.getX();
    }

    public void setX(float x) {
        drawable.setX(x);
    }

    public float getY() {
        return drawable.getY();
    }

    public void setY(float y) {
        drawable.setY(y);
    }

    public void release() {
        if (drawable != null) {
            drawable.release();
        }
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "%f, %f", drawable.getX(), drawable.getY());
    }
}
