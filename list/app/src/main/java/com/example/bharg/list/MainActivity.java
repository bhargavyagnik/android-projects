package com.example.bharg.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<person> people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.List) ;
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<person>();
        people.add(new person("John","Rambo","bus"));
        people.add(new person("Bhargav","Yagnik","bus"));
        people.add(new person("Koradia","Yash","plane"));
        people.add(new person("Varun","Saha","plane"));
        people.add(new person("Tanmay","Adhikkari","bus"));
        people.add(new person("Jack","kalavadia","bus"));
        people.add(new person("Varun","Borsadia","plane"));
        people.add(new person("Vatsal","MAkadia","bus"));
        people.add(new person("MAnan","Gandhi","plane"));
        people.add(new person("Deep","Satodia","bus"));
        people.add(new person("Urvi","rawat","bus"));

            myAdapter= new personAdapter(this,people);
            recyclerView.setAdapter(myAdapter);

    }
}
