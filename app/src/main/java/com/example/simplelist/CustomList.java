package com.example.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        userList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name=names[position];
                String email=emails[position];
                int image=images[position];
                Intent detailIntent = new Intent(CustomList.this, Detail.class);
                detailIntent.putExtra("name",name);
                detailIntent.putExtra("email",email);
                detailIntent.putExtra("image",image);
                startActivity(detailIntent);
                Toast.makeText(CustomList.this, "name "+name, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
