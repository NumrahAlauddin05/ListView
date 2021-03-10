package com.example.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //String[] androidNames=new String[5];
    String[] androidNames={"Cupcake","Donut","Eclair","Froyo","GingerBread","HoneyComb","IcecreamSandwich"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        arrayAdapter=new ArrayAdapter<>(MainActivity.this,R.layout.list_item,R.id.nameTv,androidNames);
        listView.setAdapter(arrayAdapter);

    }
}
