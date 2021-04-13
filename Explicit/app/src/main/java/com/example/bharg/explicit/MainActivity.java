package com.example.bharg.explicit;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et1;
Button bt1,bt2;
TextView tv1;
final  int ACTIVITY3=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.etname);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        tv1=findViewById(R.id.tv);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter name",Toast.LENGTH_SHORT).show();
                }
                else {
                    String name = et1.getText().toString().trim();
                    Intent  intent=new Intent(MainActivity.this,com.example.bharg.explicit.Activity2.class);
                    intent.putExtra("name"/*any name you can pass*/,name);
                    startActivity(intent);


                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,com.example.bharg.explicit.Activity3.class);
               startActivityForResult(intent,ACTIVITY3);
                
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==ACTIVITY3){
            if(resultCode==RESULT_OK){
                tv1.setText(data.getStringExtra("surname"));
            }
            if (resultCode==RESULT_CANCELED){
                tv1.setText("No data Recieved");
            }
        }
    }
}
