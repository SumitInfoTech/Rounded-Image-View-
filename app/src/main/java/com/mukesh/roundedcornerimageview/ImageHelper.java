package com.mukesh.roundedcornerimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;

public class ImageHelper {
    public static Bitmap imageFromDrawble(Context context, int drawble) {
        Bitmap bitmap = ((BitmapDrawable) context.getDrawable(drawble)).getBitmap();

        return roundBitmap(bitmap);



    }

    private static Bitmap roundBitmap(Bitmap bitmap) {


        Bitmap roundBitmap = Bitmap.createBitmap(bitmap.getWidth(),bitmap.getHeight(),bitmap.getConfig());
        Canvas canvas = new Canvas(roundBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP));
        RectF rectF = new RectF(0,0,bitmap.getWidth(),bitmap.getHeight());
        canvas.drawRoundRect(rectF ,100,100,paint);
        return roundBitmap;


    }
}