package com.zonsim.dagger2_demo.demo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zonsim.dagger2_demo.R;

import javax.inject.Inject;

/**
 * "@Inject" 注解构造函数Demo
 * Created by home-pc on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

public class DemoActivity1 extends AppCompatActivity {
    
    @Inject
    Student mStudent;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1_activity);
        
        System.out.println("name: " + mStudent.getName());
    }
    
    
}
