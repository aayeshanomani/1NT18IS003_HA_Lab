package com.example.sumoftwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lifecycle","onCreate invoked");

        Button addButton = (Button) findViewById(R.id.addButton);
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);

        Intent intent = new Intent(this, ResultScreen.class);
        addButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());

                double res = n1+n2;

                Bundle extras = new Bundle();

                extras.putString("num1", String.valueOf(n1));
                extras.putString("num2", String.valueOf(n2));
                extras.putString("result", String.valueOf(res));

                intent.putExtras(extras);

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Lifecycle","onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Lifecycle","onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Lifecycle","onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Lifecycle","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Lifecycle","onDestroy invoked");
    }
}