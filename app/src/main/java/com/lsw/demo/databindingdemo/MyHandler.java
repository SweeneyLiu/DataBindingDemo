package com.lsw.demo.databindingdemo;

import android.view.View;
import android.widget.Toast;

/**
 * Create by liushuwei on 2020/7/29
 */
public class MyHandler {
    /**
     * @param view
     */
    public void onClickEvent(View view){
        Toast.makeText(view.getContext(), "click me", Toast.LENGTH_SHORT).show();
    }
}
