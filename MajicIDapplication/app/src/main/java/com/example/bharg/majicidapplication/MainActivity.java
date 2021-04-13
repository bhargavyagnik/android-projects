package com.example.bharg.majicidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etid;
    Button bt1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etid=findViewById(R.id.etID);
        bt1=findViewById(R.id.bt1);
        tv1=findViewById(R.id.tv1);
        tv1.setVisibility(View.GONE);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String id=etid.getText().toString().trim();
                    String dob=id.substring(0,6);
                    int gender=Integer.parseInt(Character.toString(id.charAt(6)));
                    String sgender;
                    if(gender<5)
                        sgender="Female";
                    else
                        sgender="Male";
                    int nation;
                nation = Integer.parseInt(Character.toString(id.charAt(10)));
                String snation;
                if(nation==0)
                    snation="SACitizen";
                else
                    snation="Not a Citizen";
                tv1.setVisibility(View.VISIBLE);
                tv1.setText("Date of Birth "+ dob+ "\ngender "+sgender+"\nNAtionality "+ snation);
            }
        });

    }
}
