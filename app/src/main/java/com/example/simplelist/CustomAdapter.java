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

    User[] users;


//    public CustomAdapter(Context context, String[] userNames, String[] userEMails, int[] userImages) {
//        this.context = context;
//        this.userNames = userNames;
//        this.userEMails = userEMails;
//        this.userImages = userImages;
//    }


    public CustomAdapter(Context context, User[] users) {
        this.context = context;
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.length;
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

        nameTv.setText(users[position].getName());
        emailTv.setText(users[position].getEmail());
        image.setImageResource(users[position].getImage());


        return view;
    }
}
