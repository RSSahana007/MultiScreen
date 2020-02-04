package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText first;
    private EditText last;
    private EditText age;
    private RadioButton male;
    private RadioButton female;
    private Button calculate;
    private Button interest;
    private  Intent secondscreen;
    private  Intent thirdscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.first);
        last = findViewById(R.id.last);
        age = findViewById(R.id.age);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        calculate = findViewById(R.id.calculate);
        interest = findViewById(R.id.interest);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                secondscreen = new Intent(getApplicationContext(), calculate.class);
                secondscreen.putExtra("name", first.getText().toString());
                startActivity(secondscreen);


            }
        });

        interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                thirdscreen = new Intent(getApplicationContext(), interest.class);
                thirdscreen.putExtra("name", first.getText().toString());
                startActivity(thirdscreen);
            }
        });






    }
}
