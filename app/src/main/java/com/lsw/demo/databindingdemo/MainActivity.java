package com.lsw.demo.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.lsw.demo.databindingdemo.databinding.ActivityMainBinding;

/**
 * 参考：https://juejin.im/post/5ecb03b2e51d45784c52d739
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //生成绑定类
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //绑定视图与数据
        User user = new User("张三");
        binding.setUser(user);

        binding.setHandler(new MyHandler());

        binding.setPresenter(new MyPresenter(this));
    }
}