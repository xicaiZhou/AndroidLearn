 package com.example.zhouxicai.androidlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

 public class ListViewActivity extends AppCompatActivity {
    private ListView mLv1;
    private List<nemu>mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mLv1 = findViewById(R.id.lv_1);

        mData = new LinkedList<nemu>();
        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","TextView"));
        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","Button"));
        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","EditText"));
        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","RadioAndCheck"));
        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","ImageView"));
        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","ProgressBar"));

        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","SwitchAndToggle"));
        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","SeekBar"));
        mData.add(new nemu("学习内容","https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","2018-07-25","RatingBar"));

        MyListAdapter adapter = new MyListAdapter((LinkedList<nemu>) mData, ListViewActivity.this);
        mLv1.setAdapter(adapter);



        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                switch (i){
                    //跳转到TextView学习界面
                    case 0:
                        intent = new Intent(ListViewActivity.this, TextViewActivity.class);
                        break;
                    //跳转到Button学习界面
                    case 1:
                        intent = new Intent(ListViewActivity.this, ButtonActivity.class);
                        break;
                    //跳转到EditText学习界面
                    case 2:
                        intent = new Intent(ListViewActivity.this, EditTextActivity.class);
                        break;
                    case 3:
                        intent = new Intent(ListViewActivity.this, RadioAndCheckActivity.class);
                        break;
                    case 4:
                        intent = new Intent(ListViewActivity.this, ImageVIewActivity.class);
                        break;
                    case 5:
                        intent = new Intent(ListViewActivity.this, ProgressBarActivity.class);
                        break;
                    case 6:
                        intent = new Intent(ListViewActivity.this, ToggleAndSwitchActivity.class);
                        break;
                    case 7:
                        intent = new Intent(ListViewActivity.this, SeekBarActivity.class);
                        break;
                    case 8:
                        intent = new Intent(ListViewActivity.this, RatingBarctivity.class);
                        break;
                }
                startActivity(intent);
            }
        });

    }
}
