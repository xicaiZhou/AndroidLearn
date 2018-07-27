package com.example.zhouxicai.androidlearn;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ProgressBarActivity extends AppCompatActivity {
    private ImageView im;
    private AnimationDrawable ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        im = findViewById(R.id.im_pro_1);
        ad = (AnimationDrawable) im.getDrawable();
        im.postDelayed(new Runnable() {
            @Override
            public void run() {
                ad.start();
            }
        }, 100);
    }
}
