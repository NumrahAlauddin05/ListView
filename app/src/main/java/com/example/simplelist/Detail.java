package com.example.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView nameTv;
    TextView emailTv;
    ImageView imageIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nameTv=findViewById(R.id.nameTv);
        emailTv=findViewById(R.id.emailTv);
        imageIV=findViewById(R.id.image);

        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");
        String email=bundle.getString("email");
        int image=bundle.getInt("image");

        nameTv.setText(name);
        emailTv.setText(email);
        imageIV.setImageResource(image);

    }
}
