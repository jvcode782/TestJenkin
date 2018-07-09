package com.barquecontech.appfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Typeface tf = Typeface.createFromAsset(getApplication().getAssets(), "OpenSans-Semibold.ttf");
        TextView textView = (TextView) findViewById(R.id.hello);
        TextView customTextView = (TextView) findViewById(R.id.customtextview);
       customTextView.setTypeface(tf);
      //  textView.setTypeface(tf);
    }
}
