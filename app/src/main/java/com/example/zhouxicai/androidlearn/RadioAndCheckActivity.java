package com.example.zhouxicai.androidlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioAndCheckActivity extends AppCompatActivity {

    private RadioGroup RG1;
    private Button commit;


    private CheckBox mCB_1, mCB_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_and_check);

        RG1 = findViewById(R.id.RG_1);
        // action1
        RG1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton RB = findViewById(checkedId);
                Toast.makeText(RadioAndCheckActivity.this, RB.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        // action2
        commit = findViewById(R.id.commit);
        commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < RG1.getChildCount(); i++){
                    RadioButton rb = (RadioButton) RG1.getChildAt(i);
                    if (rb.isChecked()) {
                        Toast.makeText(RadioAndCheckActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        mCB_1 = findViewById(R.id.cb_5);
        mCB_2 = findViewById(R.id.cb_6);

        // checkBox
        mCB_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               Toast.makeText(RadioAndCheckActivity.this, isChecked ? "mCB1被选中" : "mCB1被取消选中", Toast.LENGTH_SHORT).show();
            }
        });

        // checkBox
        mCB_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(RadioAndCheckActivity.this, isChecked ? "mCB2被选中" : "mCB2被取消选中", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
