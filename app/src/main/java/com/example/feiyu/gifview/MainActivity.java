package com.example.feiyu.gifview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.feiyu.gifview.GifView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GifView gif_view = findViewById(R.id.gif_view);
        gif_view.setScaleType(GifView.FIT_CENTER);
        gif_view.setGifResource(R.mipmap.demo1);
        gif_view.play();


    }
}
