package com.stormdzh.androidttf;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_test= (TextView) findViewById(R.id.tv_test);
//        Typeface typeFace =Typeface.createFromAsset(getAssets(),"fonts/814yzx.TTF");
        Typeface typeFace =Typeface.createFromAsset(getAssets(),"fonts/over.TTF");
        tv_test.setTypeface(typeFace);
    }
}
