package com.example.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CustomList extends AppCompatActivity {

    ListView userList;
    CustomAdapter adapter;
    String[] names = {"Ali", "Sara", "Sana"};
    String[] emails = {"ali@gmail.com", "sara@gmail.com", "sana@gmail.com"};
    int[] images = {R.mipmap.ic_launcher,R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        userList = findViewById(R.id.customList);
        adapter = new CustomAdapter(CustomList.this, names,emails,images );
        userList.setAdapter(adapter);

    }
}
