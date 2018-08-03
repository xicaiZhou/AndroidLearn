package com.example.zhouxicai.androidlearn;

import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;

public class ListViewActivity extends AppCompatActivity {

    private Button zBtn_add1, zBtn_add2, zBtn_remove1, zBtn_remove2;
    private ListView zListView;
    private TextView zTextView;
    private LinkedList<Data> mData = null;
    private int index = 1;
    private Data mData_5 = null;
    private ListAdapter listAdapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        bindView();

        mData = new LinkedList<Data>();
        listAdapter = new ListAdapter(mData, ListViewActivity.this);
        zListView.setAdapter(listAdapter);

        zTextView.setText("暂无数据~");
        zListView.setEmptyView(zTextView);

    }
//    private void updateListItem(int postion,Data mData){
//        int visiblePosition = zListView.getFirstVisiblePosition();
//        View v = zListView.getChildAt(postion - visiblePosition);
//        TextView tv = (TextView) v.findViewById(R.id.txt_content);
//        tv.setText(mData.getContent());
//    }

    private void bindView(){
        zBtn_add1 = findViewById(R.id.btn_add);
        zBtn_add2 = findViewById(R.id.btn_add2);

        zBtn_remove1 = findViewById(R.id.btn_remove);
        zBtn_remove2 = findViewById(R.id.btn_remove2);

        zListView = findViewById(R.id.list_one);

        zTextView = findViewById(R.id.txt_empty);

        setOnClick();

    }

    private void setOnClick(){
        onClick click = new onClick();
        zBtn_add1.setOnClickListener(click);
        zBtn_add2.setOnClickListener(click);

        zBtn_remove1.setOnClickListener(click);
        zBtn_remove2.setOnClickListener(click);

    }

    private class onClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_add:
                    if(index == 5){
                        mData_5 = new Data("https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","给猪哥跪了~~~ x " + index);
                        listAdapter.add(mData_5);
                    }else{
                        listAdapter.add(new Data("https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","给猪哥跪了~~~ x " + index));
                    }
                    index++;
                    break;
                case R.id.btn_add2:
                    //position从0开始算的
                    listAdapter.add(4,new Data("https://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png","给猪哥跪了~~~ x " + index));
                    break;
                case R.id.btn_remove:
                    listAdapter.remove(mData_5);
                    break;
                case R.id.btn_remove2:
                    listAdapter.remove(0);
                    break;
            }
        }
    }

}
