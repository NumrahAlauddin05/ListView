package com.example.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //String[] androidNames=new String[5];
    String[] androidNames = {"Cupcake", "Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb", "IcecreamSandwich"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.list_item, R.id.nameTv, androidNames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = androidNames[position];
                Intent detailIntent = new Intent(MainActivity.this, Detail.class);
                detailIntent.putExtra("name",name);
                startActivity(detailIntent);
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
