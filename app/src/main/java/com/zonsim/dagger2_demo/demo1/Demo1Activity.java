package com.zonsim.dagger2_demo.demo1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zonsim.dagger2_demo.R;

import javax.inject.Inject;

/**
 * "@Inject" 注解构造函数Demo
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

@SuppressLint("Registered")
public class Demo1Activity extends AppCompatActivity {
    
    @Inject
    Demo1Student mDemo1Student;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1_activity);
        
        //dagger 两种方式都可以
        Demo1Component component = DaggerDemo1Component.builder()
                .build();
        Demo1Component component1 = DaggerDemo1Component.create();
        
        component.inject(this);
        
        System.out.println("name: " + mDemo1Student.getName());
    }
    
    
}
