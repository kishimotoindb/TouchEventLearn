package com.fearlessbear.toucheventlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
 * 1.如果两个View位置重叠，事件怎么分发？
 * 
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
