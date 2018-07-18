package com.example.zhouxicai.androidlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button mBtn_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn_5 = findViewById(R.id.btn_5);
        mBtn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"btn_5被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void showToast(Button btn){
        Toast.makeText(ButtonActivity.this,"我被点击了",Toast.LENGTH_SHORT).show();
    }
}
