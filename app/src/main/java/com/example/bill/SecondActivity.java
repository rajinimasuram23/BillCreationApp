package com.example.bill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6;
    String s1,s2,s3,s4,s5,s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.invoice);

        s1 = getIntent().getExtras().getString("one");
        s2 = getIntent().getExtras().getString("two");
        s3 = getIntent().getExtras().getString("three");
        s4 = getIntent().getExtras().getString("four");
        s5 = getIntent().getExtras().getString("five");
        s6 = getIntent().getExtras().getString("six");

        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
        t4.setText(s4);
        t5.setText(s5);
        t6.setText(s6);

    }
}
