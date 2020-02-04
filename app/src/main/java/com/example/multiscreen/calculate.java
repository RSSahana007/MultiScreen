package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculate extends AppCompatActivity {

    private EditText aEditText1;
    private EditText aEditText2;
    private TextView aTextViewResult;
    private Button aButtonAdd;
    private Button aButtonSubtract;
    private Button multiply;
    private Button divide;
    private Intent a;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        a = getIntent();
        String name = a.getStringExtra("name");


        display = findViewById(R.id.text);
        display.setText("Hello " + name);
        aEditText1 = findViewById(R.id.edittext_number_1);
        aEditText2 = findViewById(R.id.edittext_number_2);
        aTextViewResult = findViewById(R.id.textview_result);
        aButtonAdd = findViewById(R.id.button_add);
        aButtonSubtract = findViewById(R.id.button_subtract);
        multiply = findViewById(R.id.button_multiply);
        divide = findViewById(R.id.button_divide);

        aEditText1.setText("");
        aEditText2.setText("");
        aButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (aEditText1.getText().toString().equals("") || aEditText2.getText().toString().equals("")) {
                    aTextViewResult.setText("No Result");
                }

                int num1 = Integer.parseInt(aEditText1.getText().toString());
                int num2 = Integer.parseInt(aEditText2.getText().toString());
                int sum = num1 + num2;

                aTextViewResult.setText(String.valueOf(sum));
            }
        });
        aButtonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (aEditText1.getText().toString().equals("") || aEditText2.getText().toString().equals("")) {
                    aTextViewResult.setText("No Result");
                }

                int num1 = Integer.parseInt(aEditText1.getText().toString());
                int num2 = Integer.parseInt(aEditText2.getText().toString());
                int subtract = num1 - num2;

                aTextViewResult.setText(String.valueOf(subtract));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (aEditText1.getText().toString().equals("") || aEditText2.getText().toString().equals("")) {
                    aTextViewResult.setText("No Result");
                }

                int num1 = Integer.parseInt(aEditText1.getText().toString());
                int num2 = Integer.parseInt(aEditText2.getText().toString());
                int mul = num1 * num2;

                aTextViewResult.setText(String.valueOf(mul));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (aEditText1.getText().toString().equals("") || aEditText2.getText().toString().equals("")) {
                    aTextViewResult.setText("No Result");
                }

                int num1 = Integer.parseInt(aEditText1.getText().toString());
                int num2 = Integer.parseInt(aEditText2.getText().toString());
                int div = num1 / num2;

                aTextViewResult.setText(String.valueOf(div));
            }
        });

    }
}
