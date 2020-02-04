package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class interest extends AppCompatActivity {
    private EditText principal;
    private EditText interest;
    private EditText time;
    private Button calculate;
    private TextView result;
    private Intent b;
    private TextView display2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);

        b = getIntent();
        String name = b.getStringExtra("name");

        display2 = findViewById(R.id.text);
        display2.setText("Hello " + name);
        principal = findViewById(R.id.principal);
        interest = findViewById(R.id.interest);
        time = findViewById(R.id.time);
        calculate = findViewById(R.id.button);
        result = findViewById(R.id.result);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(principal.getText().toString());
                int b = Integer.parseInt(interest.getText().toString());
                int c = Integer.parseInt(time.getText().toString());
                int d=(a*b*c)/100;
                result.setText(String.valueOf(d));


            }
        });
    }
}
