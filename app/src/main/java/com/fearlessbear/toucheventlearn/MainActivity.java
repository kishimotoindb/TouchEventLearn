package com.fearlessbear.toucheventlearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/*
 * 1.如果两个View位置重叠，事件怎么分发？
 *
 * 2.如果View中途放弃对TouchEvent的处理，之后TouchEvent怎么分发？
 *
 * 3.Scroll是否影响View接收事件的坐标范围？判断TouchEvent是否在View内时，是否考虑Scroll的影响？
 *
 */

public class MainActivity extends AppCompatActivity {
    boolean scrolled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
         * 问题3：
         * ScrollBy(),ScrollTo(),Scroller三种滚动方式，改变的只是View内容的偏移量，并不改变
         * View的left,top,right,bottom参数，所以在布局时，View的位置还是在布局参数所指定的位置。
         *
         * 事件分发依据的也是布局参数，Scroll并不被考虑在内。即，即使发生了滚动，点击事件依然作用
         * 在原来的位置。
         * 所以判断TouchEvent是否在View内时，依然使用的是left,top,right,bottom，而不考虑Scroll
         *
            final View scrollView = findViewById(R.id.text);
            scrollView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (scrolled) {
                        Toast.makeText(getBaseContext(), "点到我了", Toast.LENGTH_LONG).show();
                    } else {
                        scrollView.scrollBy(50, 50);
                        scrolled = true;
                    }
                }
            });
        */
    }
}
