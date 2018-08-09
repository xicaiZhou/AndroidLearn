 package com.example.zhouxicai.androidlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.zhouxicai.androidlearn.GridView.GridViewActivity;

import java.util.LinkedList;
import java.util.List;

 public class MainListViewActivity extends AppCompatActivity {
    private ListView mLv1;
    private List<nemu>mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mLv1 = findViewById(R.id.lv_1);

        mData = new LinkedList<nemu>();
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","TextView"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","Button"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","EditText"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","RadioAndCheck"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","ImageView"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","ProgressBar"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","SwitchAndToggle"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","SeekBar"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","RatingBar"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","ScrollView"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","DateAndTime"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","ListView"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","GridView"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","Spinner"));
        mData.add(new nemu("学习内容","https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1188070358,4241211350&fm=27&gp=0.jpg","2018-07-25","AutoCompleteTextViewActivity"));


        MyListAdapter adapter = new MyListAdapter((LinkedList<nemu>) mData, MainListViewActivity.this);
        mLv1.setAdapter(adapter);



        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                switch (i){
                    //跳转到TextView学习界面
                    case 0:
                        intent = new Intent(MainListViewActivity.this, TextViewActivity.class);
                        break;
                    //跳转到Button学习界面
                    case 1:
                        intent = new Intent(MainListViewActivity.this, ButtonActivity.class);
                        break;
                    //跳转到EditText学习界面
                    case 2:
                        intent = new Intent(MainListViewActivity.this, EditTextActivity.class);
                        break;
                    case 3:
                        intent = new Intent(MainListViewActivity.this, RadioAndCheckActivity.class);
                        break;
                    case 4:
                        intent = new Intent(MainListViewActivity.this, ImageVIewActivity.class);
                        break;
                    case 5:
                        intent = new Intent(MainListViewActivity.this, ProgressBarActivity.class);
                        break;
                    case 6:
                        intent = new Intent(MainListViewActivity.this, ToggleAndSwitchActivity.class);
                        break;
                    case 7:
                        intent = new Intent(MainListViewActivity.this, SeekBarActivity.class);
                        break;
                    case 8:
                        intent = new Intent(MainListViewActivity.this, RatingBarctivity.class);
                        break;
                    case 9:
                        intent = new Intent(MainListViewActivity.this, ScrollViewActivity.class);
                        break;
                    case 10:
                        intent = new Intent(MainListViewActivity.this, DateAndTimeActivity.class);
                        break;
                    case 11:
                        intent = new Intent(MainListViewActivity.this, ListViewActivity.class);
                        break;
                    case 12:
                        intent = new Intent(MainListViewActivity.this, GridViewActivity.class);
                        break;
                    case 13:
                        intent = new Intent(MainListViewActivity.this, SpinnerActivity.class);
                        break;
                    case 14:
                        intent = new Intent(MainListViewActivity.this, AutoCompleteTextViewActivity.class);
                        break;
                }
                startActivity(intent);
            }
        });

    }
}
