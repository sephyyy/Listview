package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= findViewById(R.id.lv);
        arrayList=new ArrayList();
        arrayList.add("india");
        arrayList.add("Georgia");
        arrayList.add("USA");
        arrayList.add("UK");

        arrayAdapter=new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(arrayAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String g = (String) arrayList.get(position);
                Toast.makeText(MainActivity.this, g, Toast.LENGTH_SHORT).show();
            }
        });
    }
}