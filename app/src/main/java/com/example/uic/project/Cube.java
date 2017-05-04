package com.example.uic.project;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * Created by UIC on 5/4/2017.
 */

public class Cube {
    private float left,top,right,bottom;
    private Paint p;
    private Random r = new Random();
    public Cube(float left, float top, float right, float bottom, Canvas c){
        this.left=left;
        this.top=top;
        this.right=right;
        this.bottom=bottom;
    }
    public void draw(Canvas c){
        p=new Paint();
        p.setColor(Color.rgb(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
        p.setStyle(Paint.Style.FILL);
        c.drawRect(left,top,right,bottom,p);
    }
}
