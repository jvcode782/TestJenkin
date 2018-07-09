package com.barquecontech.niranjantest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private static int first;
    private static int second;
    private static int b;
    private EditText text;
    private Button sub;
    private Button add;
    private Button mul;
    private Button div;
    private Button result;
    private static String val="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.result);
        sub=(Button) findViewById(R.id.sub);
        result=(Button) findViewById(R.id.result1);
        add=(Button) findViewById(R.id.add);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val="sub";
                String a = text.getText().toString();

                first = Integer.parseInt(a);
                text.setText("");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val="add";
            String a=text.getText().toString();

                first =Integer.parseInt(a);
                text.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val="div";
                String a=text.getText().toString();

                first =Integer.parseInt(a);
                text.setText("");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val="mul";
                String a=text.getText().toString();

                first =Integer.parseInt(a);
                text.setText("");
            }
        });


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a=text.getText().toString();

                second =Integer.parseInt(a);
                if (val=="add")
                    b=first+second;
                 else if(val=="sub")
                    b=first-second;
                else if(val=="mul")
                    b=first*second;
                text.setText(b+"");
            }
        });


    }
}