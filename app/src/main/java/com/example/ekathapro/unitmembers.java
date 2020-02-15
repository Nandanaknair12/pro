package com.example.ekathapro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class unitmembers extends AppCompatActivity {

    EditText unitname;
    Button seemem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitmembers);

        unitname=(EditText) findViewById(R.id.cdsunitname);
        seemem=(Button)findViewById(R.id.seemembers);

        seemem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),cdsseemembers.class);
                startActivity(intent);
            }
        });
    }
}
