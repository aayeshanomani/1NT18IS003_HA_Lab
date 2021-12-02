package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.progList);
        final String values[] = {"C", "C++", "Java", "Android", "C#", "Assembly", "Python", "Ruby", "VB", "Scala"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.preference_category, Arrays.asList(values));

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "You Clicked "+values[position], Toast.LENGTH_SHORT).show();
            }

        });
    }
}