package com.example.sec3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class customAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<Article>articles;

    public customAdapter(Activity activity, ArrayList<Article> articles) {
        this.activity = activity;
        this.articles = articles;
    }

    @Override
    public int getCount() {
        return articles.size();
    }

    @Override
    public Object getItem(int position) {
        return articles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        v= inflater.inflate(R.layout.list_item,parent,false);

        TextView textView=v.findViewById(R.id.tv);
        ImageView imageView=v.findViewById(R.id.iv);

        textView.setText(articles.get(position).getTitle());

        Picasso.get().load(articles.get(position).getUrlToImage()).into(imageView);
        return v;
    }
}
