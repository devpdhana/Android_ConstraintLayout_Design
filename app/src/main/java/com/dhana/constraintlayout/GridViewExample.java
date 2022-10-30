package com.dhana.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewExample extends AppCompatActivity {

    String[] languages;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_example);
        gridView = findViewById(R.id.GridviewGrid);

        languages = getResources().getStringArray(R.array.Programing_Languages);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.items,R.id.txtItems,languages);
        gridView.setAdapter(adapter);
    }
}