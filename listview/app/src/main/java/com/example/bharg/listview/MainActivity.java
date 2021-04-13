package com.example.bharg.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ListView lv_products;
        ArrayList<product> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_products=(ListView)findViewById((R.id.lv_products));

        list= new ArrayList<product>();
        product product1= new product("Dell","This is the best Laptop available in Market","Laptop",14000.99,true);
        product product2= new product("HP","This is the best Laptop available in Market","Laptop",14000.99,true);

        product product3= new product("Toshiba","This is the best Laptop available in Market","Laptop",14000.99,true);

        product product4= new product("Alienware","This is the best Laptop available in Market","Laptop",14000.99,true);

        product product5= new product("Lenovo","This is the best Laptop available in Market","Laptop",14000.99,true);
list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        productadapter productadapter  = new productadapter(this,list);

        lv_products.setAdapter(productadapter);

    }
}
