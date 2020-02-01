package com.example.ekathapro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cdshome extends AppCompatActivity {
     Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdshome);
        b1=(Button)findViewById(R.id.presireq);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent ob=new Intent(getApplicationContext(),Acceptingpresi.class);
                startActivity(ob);
            }
        });

    }
}
