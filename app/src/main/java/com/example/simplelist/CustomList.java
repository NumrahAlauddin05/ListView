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
    int[] images = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    User[] users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        userList = findViewById(R.id.customList);


//        User user = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
//        User user1 = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
//        User user2 = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
//        User user3 = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
//        User user4 = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
        users = new User[5];
        users[0] = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
        users[1] = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
        users[2] = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
        users[3] = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
        users[4] = new User("Ali", "ali@gmail.com", R.mipmap.ic_launcher);
//        users[1]=user1;
//        users[2]=user2;
//        users[3]=user3;
//        users[4]=user4;
        //adapter = new CustomAdapter(CustomList.this, names,emails,images );


        adapter = new CustomAdapter(CustomList.this, users);
        userList.setAdapter(adapter);

        userList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = names[position];
                String email = emails[position];
                int image = images[position];
                Intent detailIntent = new Intent(CustomList.this, Detail.class);
                detailIntent.putExtra("name", name);
                detailIntent.putExtra("email", email);
                detailIntent.putExtra("image", image);
                startActivity(detailIntent);
                Toast.makeText(CustomList.this, "name " + name, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
