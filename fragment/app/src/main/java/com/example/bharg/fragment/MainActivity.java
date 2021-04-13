package com.example.bharg.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFragment.Itemselected {
    TextView tvdesc;
    ArrayList<String> description= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvdesc=findViewById(R.id.tvdetail);
        description= new ArrayList<>();
        description.add("Description for Item 1");
        description.add("Description for Item 2");
        description.add("Description for Item 3");
    }

    @Override
    public void onItemselected(int index) {
            tvdesc.setText(description.get(index));
    }
}
