package com.example.zhouxicai.androidlearn.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.zhouxicai.androidlearn.R;

import java.util.List;

/**
 * Created by zhouxicai on 2018/8/6.
 */

public class myGridViewAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater mLayouyInflater;


    public myGridViewAdapter() {
    }

    public myGridViewAdapter( Context context) {
        this.context = context;
        mLayouyInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return  10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        public ImageView im;
        public TextView tex;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder = null;
        if (view == null){
            view = mLayouyInflater.inflate(R.layout.gridview_item_layout, viewGroup, false);
            holder = new ViewHolder();
            holder.im = view.findViewById(R.id.img_icon);
            holder.tex = view.findViewById(R.id.txt_icon);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tex.setText("gridView");
        Glide.with(context).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533553938666&di=7097c614444d62f8e19fd8282fd90ba1&imgtype=0&src=http%3A%2F%2Fimg4.duitang.com%2Fuploads%2Fitem%2F201512%2F13%2F20151213190125_KcZnY.jpeg").into(holder.im);

        return view;
    }

}
