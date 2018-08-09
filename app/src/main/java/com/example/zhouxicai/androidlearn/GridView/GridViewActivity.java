package com.example.zhouxicai.androidlearn.GridView;

import android.graphics.drawable.Icon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.zhouxicai.androidlearn.R;

import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    private GridView mGridView;
    private myGridViewAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graid_view);
        bindView();
        mGridView.setAdapter(mAdapter);

    }

    private void bindView(){
        mGridView = findViewById(R.id.grid);
        mAdapter = new myGridViewAdapter( GridViewActivity.this);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewActivity.this, "你点击了~" + i + "~项", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
