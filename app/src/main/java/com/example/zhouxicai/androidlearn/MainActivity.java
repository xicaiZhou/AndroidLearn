package com.example.zhouxicai.androidlearn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_textView;
    private Button btn_button;
    private Button btn_editText;
    private Button btn_radioAndCheck;
    private Button btn_ImageView;
    private Button btn_SwitchToggle;
    private Button btn_ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*
         * 根据id取到View
         * */
        btn_textView = findViewById(R.id.textView);
        btn_button = findViewById(R.id.Button);
        btn_editText = findViewById(R.id.EditText);
        btn_radioAndCheck = findViewById(R.id.RadioAndCheck);
        btn_ImageView = findViewById(R.id.ImageView);
        btn_SwitchToggle = findViewById(R.id.SwitchToggle);
        btn_ListView = findViewById(R.id.ListView);
         /*
         * 给button添加OnClick（响应事件）
         * */
        setListeners();
    }

    private void setListeners(){
        OnClick onclick = new OnClick();
        btn_textView.setOnClickListener(onclick);
        btn_button.setOnClickListener(onclick);
        btn_editText.setOnClickListener(onclick);
        btn_radioAndCheck.setOnClickListener(onclick);
        btn_ImageView.setOnClickListener(onclick);
        btn_SwitchToggle.setOnClickListener(onclick);
        btn_ListView.setOnClickListener(onclick);

    }
    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                //跳转到TextView学习界面
                case R.id.textView:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                //跳转到Button学习界面
                case R.id.Button:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                //跳转到EditText学习界面
                case R.id.EditText:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.RadioAndCheck:
                    intent = new Intent(MainActivity.this, RadioAndCheckActivity.class);
                    break;
                case R.id.ImageView:
                    intent = new Intent(MainActivity.this, ImageVIewActivity.class);
                    break;
                case R.id.SwitchToggle:
                    intent = new Intent(MainActivity.this, ToggleAndSwitchActivity.class);
                    break;
                case R.id.ListView:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
            }
            startActivity(intent);
        }

    }
}
