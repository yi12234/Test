package com.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2017/12/14.
 */

public class Adapter extends BaseAdapter{

    private Context context;
    private List<Bean> list;

    public Adapter(Context context, List<Bean> bean) {
        this.context = context;
        this.list = bean;
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            convertView=View.inflate(context,R.layout.item,null);
            holder=new ViewHolder();
            holder.tv1=(TextView) convertView.findViewById(R.id.tv1);
            holder.tv2=(TextView) convertView.findViewById(R.id.tv2);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        holder.tv1.setText(list.get(position).str1);
        holder.tv2.setText(list.get(position).str2);
        return convertView;
    }
    class ViewHolder{
        TextView tv1,tv2;
    }
}
