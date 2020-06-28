package com.example.bill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText Typeofunit,Noofunits,Noofbags,Unitrate,Invoice;
    Button submit;
    String str1,str2,str3,str4,str5,str6;
    int units;
    float rate,amnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeofunit = findViewById(R.id.Typeofunit);
        Noofunits = findViewById(R.id.Noofunits);
        Noofbags = findViewById(R.id.Noofbags);
        Unitrate = findViewById(R.id.unitrate);
        Invoice = findViewById(R.id.in);
        submit = findViewById(R.id.SUBMIT);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                str1 = Typeofunit.getText().toString();
                str2 = Noofunits.getText().toString();
                str3 = Noofbags .getText().toString();
                str4 = Unitrate.getText().toString();
                str6 = Invoice.getText().toString();
                units = Integer.parseInt(str2);
                rate = Float.valueOf(str4);
                amnt = units*rate;
                str5 = Float.toString(amnt);
                i.putExtra("one",str1);
                i.putExtra("two",str2);
                i.putExtra("three",str3);
                i.putExtra("four",str4);
                i.putExtra("five",str5);
                i.putExtra("six",str6);
                startActivity(i);
                finish();


            }
        });
    }
}
