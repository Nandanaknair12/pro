package com.example.ekathapro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Memregi extends AppCompatActivity {
    EditText e1,e2,e4,e5,e6,e7;
    Button b1,b2;
    Spinner e3;
    Memb memb;

    String mna,mpl,mwa,mmo,mus,mpa,mre,mn1,mp,mw,mm,mu,mp1;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memregi);
        e1=(EditText)findViewById(R.id.munitnam);
        e2=(EditText)findViewById(R.id.mplce);
        e3=(Spinner)findViewById(R.id.mward);
        e4=(EditText)findViewById(R.id.mmob);
        e5=(EditText)findViewById(R.id.musername);
        e6=(EditText)findViewById(R.id.mpass);
        e7=(EditText)findViewById(R.id.mrepass);
        b1=(Button)findViewById(R.id.mregis);
        b2=(Button)findViewById(R.id.msignin);
        memb=new Memb();
        databaseReference= FirebaseDatabase.getInstance().getReference().child("Member");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mna=e1.getText().toString().trim();
                mpl=e2.getText().toString().trim();
                mwa=e3.getSelectedItem().toString().trim();
                mmo=e4.getText().toString().trim();
                mus=e5.getText().toString().trim();
                mpa=e6.getText().toString().trim();
                mre=e7.getText().toString().trim();


                if(mna.equals(""))
                {
                    e1.setError("Unitname is required");
                    e1.requestFocus();
                }
                else if(mpl.equals(""))
                {
                    e2.setError("Place is required");
                    e2.requestFocus();
                }
                else if(mmo.equals(""))
                {
                    e4.setError("Mobilenumber is required");
                    e4.requestFocus();
                }
                else if(mus.equals(""))
                {
                    e5.setError("Username is required");
                    e5.requestFocus();
                }
                else if(mpa.equals(""))
                {
                    e6.setError("Password is required");
                    e6.requestFocus();
                }
                else if(mre.equals(""))
                {
                    e7.setError("RetypePassword is required");
                    e7.requestFocus();
                }
                else if(!mpa.equals(mre)) {
                    e7.setError("Password does not match");
                    e7.requestFocus();
                }
                else {
                    memb.setMname(mna);
                    memb.setMplace(mpl);
                    memb.setMward(mwa);
                    memb.setMmobile(mmo);
                    memb.setMuser(mus);
                    memb.setMpassw(mpa);

                    databaseReference.push().setValue(memb).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            Toast.makeText(getApplicationContext(),"succesfully registered",Toast.LENGTH_SHORT).show();

                            e1.setText("");
                            e2.setText("");
                            e4.setText("");
                            e5.setText("");
                            e6.setText("");
                            e7.setText("");

                            Intent ob=new Intent(getApplicationContext(),Memlog.class);
                            startActivity(ob);
                        }
                    });
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(),Memlog.class);
                startActivity(ob);
            }
        });

    }
}
