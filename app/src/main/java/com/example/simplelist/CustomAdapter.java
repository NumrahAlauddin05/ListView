package com.example.simplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] userNames;
    String[] userEMails;
    int[] userImages;


    public CustomAdapter(Context context, String[] userNames, String[] userEMails, int[] userImages) {
        this.context = context;
        this.userNames = userNames;
        this.userEMails = userEMails;
        this.userImages = userImages;
    }

    @Override
    public int getCount() {
        return userNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item1, null);
        TextView nameTv = view.findViewById(R.id.userName);
        TextView emailTv = view.findViewById(R.id.emailTv);
        ImageView image = view.findViewById(R.id.userImage);

        nameTv.setText(userNames[position]);
        emailTv.setText(userEMails[position]);
        image.setImageResource(userImages[position]);


        return view;
    }
}
