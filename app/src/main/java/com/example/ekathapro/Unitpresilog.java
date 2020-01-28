package com.example.ekathapro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Unitpresilog extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitpresilog);
        e1=(EditText)findViewById(R.id.username);
        e2=(EditText)findViewById(R.id.pass);
        b1=(Button)findViewById(R.id.btlogin);
        b2=(Button)findViewById(R.id.regi);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(),Unitpresregi.class);
                startActivity(ob);

            }
        });
    }
}
