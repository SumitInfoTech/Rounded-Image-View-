package com.mukesh.roundedcornerimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Bitmap bitmap = ImageHelper.imageFromDrawble(MainActivity.this,R.drawable.bill);
        imageView.setImageBitmap(bitmap);
    }
}