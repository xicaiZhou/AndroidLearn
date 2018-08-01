package com.example.zhouxicai.androidlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class ScrollViewActivity extends AppCompatActivity {

    private Button btn_down, btn_up;
    private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        btn_down = findViewById(R.id.btn_11);
        btn_up = findViewById(R.id.btn_10);
        scrollView = findViewById(R.id.scrollView_1);

        onClick click = new onClick();
        btn_up.setOnClickListener(click);
        btn_down.setOnClickListener(click);

    }


    private class onClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_11:
                    scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                    break;
                case R.id.btn_10:
                    scrollView.fullScroll(ScrollView.FOCUS_UP);
                    break;
            }
        }
    }

}
