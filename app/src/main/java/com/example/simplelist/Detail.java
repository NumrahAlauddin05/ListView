package com.example.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView nameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nameTv=findViewById(R.id.nameTv);
        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");
        nameTv.setText(name);

    }
}
