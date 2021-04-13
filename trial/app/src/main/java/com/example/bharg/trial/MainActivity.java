package com.example.bharg.trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
EditText et_name,et_phone,et_email,et_address;
Button submit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=findViewById(R.id.et_name);
        et_email=findViewById(R.id.et_email);
        et_phone=findViewById(R.id.et_phone);
        et_address=findViewById(R.id.et_address);
        submit_btn=findViewById(R.id.submit_btn);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database= FirebaseDatabase.getInstance();
                DatabaseReference myRef= database.getReference().child("User Data").child("Name");
                String s= et_name.getText().toString().trim();
                myRef.setValue(s);
                et_name.setText("");

                String t= et_email.getText().toString().trim();
                myRef= database.getReference().child("User Data").child("Email");
                database= FirebaseDatabase.getInstance();
                myRef.setValue(t);
                et_email.setText("");

                String u= et_phone.getText().toString().trim();
                myRef= database.getReference().child("User Data").child("Phone");
                database= FirebaseDatabase.getInstance();
                myRef.setValue(u);
                et_phone.setText("");

                String z= et_address.getText().toString().trim();
                myRef= database.getReference().child("User Data").child("Address");
                database= FirebaseDatabase.getInstance();
                myRef.setValue(z);
                et_address.setText("");



            }
        });




    }
}
