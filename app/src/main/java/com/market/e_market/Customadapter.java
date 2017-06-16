package com.market.e_market;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lenovo on 09-Jun-17.
 */
public class Customadapter extends BaseAdapter {
    Context context;
    String[] text;
    int[] images;
    LayoutInflater inflater;

    public Customadapter(Home_Screen homescreen, String[] text, int[] images) {
        this.context = homescreen;
        this.text = text;
        this.images = images;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {

        return text.length;
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static class ViewHolder {
        ImageView image;
        TextView textView;

    }

    public View getView(int position, View convertView, ViewGroup arg2) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.listviewitems, null);
            holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.imgw1);
            holder.textView = (TextView) convertView
                    .findViewById(R.id.item);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.image.setBackgroundResource(images[position]);
        holder.textView.setText(text[position]);

        return convertView;
    }
}