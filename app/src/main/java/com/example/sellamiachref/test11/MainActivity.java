package com.example.sellamiachref.test11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.res);

        t1.setText("0");
        Button b1=(Button) findViewById(R.id.dec);
        Button b2=(Button) findViewById(R.id.inc);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1=(TextView)findViewById(R.id.res);
                int x= Integer.parseInt(t1.getText().toString());
                x=x-1;
                t1.setText(""+x);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1=(TextView)findViewById(R.id.res);
                int x= Integer.parseInt(t1.getText().toString());
                x=x+1;
                t1.setText(""+x);
            }
        });
    }
}