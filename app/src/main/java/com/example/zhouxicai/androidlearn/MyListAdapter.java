package com.example.zhouxicai.androidlearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.security.PrivateKey;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhouxicai on 2018/7/25.
 */

public class MyListAdapter extends BaseAdapter {

    private List<nemu> arr;
    private Context context;
    private LayoutInflater mLayouyInflater;

    public MyListAdapter(LinkedList<nemu> arr, Context context){
        this.arr = arr;
        this.context = context;
        mLayouyInflater = LayoutInflater.from(context);

    }


    public void setArr(List<nemu> arr) {
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null){
             convertView = mLayouyInflater.inflate(R.layout.layout_list_item, null);
             holder = new ViewHolder();
             holder.imageView = convertView.findViewById(R.id.item_im_1);
             holder.tvTitle = convertView.findViewById(R.id.item_TV_1);
             holder.tvTime = convertView.findViewById(R.id.item_TV_2);
             holder.tvContent = convertView.findViewById(R.id.item_TV_3);
             convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }
     //赋值
        holder.tvTitle.setText(arr.get(position).getName());
        holder.tvTime.setText(arr.get(position).getTime());
        holder.tvContent.setText(arr.get(position).getContent());
        Glide.with(context).load(arr.get(position).getImageURL()).into(holder.imageView);

        return convertView;
    }
}

