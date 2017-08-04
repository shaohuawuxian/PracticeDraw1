package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
        int w=500;
        Paint paint=new Paint();
        //canvas.drawOval(getWidth()/2-w/2,getHeight()/2-w/2,getWidth()/2+w/2,getHeight()/2+w/2,paint);
        RectF rectF=new RectF(getWidth()/2-w/2,getHeight()/2-w/2,getWidth()/2+w/2,getHeight()/2);
        canvas.drawOval(rectF,paint);
    }
}
