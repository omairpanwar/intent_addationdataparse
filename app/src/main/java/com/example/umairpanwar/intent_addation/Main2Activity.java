package com.example.umairpanwar.intent_addation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView mTextView;
    String str1,str2;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle intent = getIntent().getExtras();
        str1=intent.getString("number1");
        int convertedval = Integer.parseInt(str1);
        str2=intent.getString("number2");
        int convertedval2 = Integer.parseInt(str2);
        int result = convertedval+convertedval2;

        TextView tv = findViewById(R.id.main_textview);
        tv.setText(String.valueOf(result));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
