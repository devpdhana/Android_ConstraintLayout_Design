package com.dhana.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class List_View extends AppCompatActivity {
    ListView listView;
    String[] items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView);
        items = getResources().getStringArray(R.array.Programing_Languages);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(List_View.this,R.layout.items,R.id.txtItems,items);
        listView.setAdapter(adapter);
    }
}