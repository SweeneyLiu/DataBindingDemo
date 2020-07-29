package com.lsw.demo.databindingdemo;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Create by liushuwei on 2020/7/29
 */
public class MyPresenter {
    private Context mContext;

    public MyPresenter(Context mContext) {
        this.mContext = mContext;
    }

    public void onClickEvent(User user) {
        Toast.makeText(mContext, user.getName(), Toast.LENGTH_SHORT).show();
    }

//    public void onClickEvent(View view, User user){
//        Toast.makeText(mContext, user.getName() + "view", Toast.LENGTH_SHORT).show();
//    }
}
