package com.example.sumoftwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        String num1 = b.getString("num1", "0");
        String num2 = b.getString("num2", "0");

        String res = b.getString("result","0");

        TextView n1 = findViewById(R.id.printNum1);
        TextView n2 = findViewById(R.id.printNum2);
        TextView r = findViewById(R.id.printresult);

        n1.setText("Num1 = "+num1);
        n2.setText("Num2 = "+num2);
        r.setText("Result = "+res);
    }
}