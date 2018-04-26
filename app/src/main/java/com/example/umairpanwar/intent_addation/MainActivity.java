package com.example.umairpanwar.intent_addation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mFirstEditText;
    private EditText mSecondEditText;
    private Button mPressForAddition;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutbinding();
        setlistner();
    }

    private void setlistner() {
        mPressForAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
             String num1 = mFirstEditText.getText().toString();
             intent.putExtra("number1",num1);
             String num2 = mSecondEditText.getText().toString();
             intent.putExtra("number2",num2);

             startActivity(intent);

            }
        });
    }

    private void layoutbinding() {
        mFirstEditText = findViewById(R.id.m_First_Edittext);
        mSecondEditText = findViewById(R.id.m_Second_Edittext);
        mPressForAddition = findViewById(R.id.m_Press_Add);
    }
}
