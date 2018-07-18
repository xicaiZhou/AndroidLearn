package com.example.zhouxicai.androidlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private EditText userName;
    private EditText passWorld;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        userName = findViewById(R.id.edit_1);
        passWorld = findViewById(R.id.edit_2);
        login = findViewById(R.id.btn_1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ("".equals(userName.getText().toString())){
                    Toast.makeText(EditTextActivity.this,"用户名不能为空",Toast.LENGTH_LONG).show();
                    return;
                }
                if ("".equals(passWorld.getText().toString())){
                    Toast.makeText(EditTextActivity.this,"密码不能为空",Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(EditTextActivity.this,"登陆成功",Toast.LENGTH_LONG).show();

            }
        });
    }
}
