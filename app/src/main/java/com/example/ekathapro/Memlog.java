package com.example.ekathapro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Memlog extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memlog);
        e1=(EditText)findViewById(R.id.musername);
        e2=(EditText)findViewById(R.id.mpass);
        b1=(Button)findViewById(R.id.mbtlogin);
        b2=(Button)findViewById(R.id.mregi);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(),Memregi.class);
                startActivity(ob);
            }
        });

    }
}
