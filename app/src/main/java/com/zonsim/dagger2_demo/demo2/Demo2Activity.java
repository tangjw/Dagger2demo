package com.zonsim.dagger2_demo.demo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zonsim.dagger2_demo.R;
import com.zonsim.dagger2_demo.demo2.DaggerDemo2Component;
import com.zonsim.dagger2_demo.demo2.DaggerDemo2Component;
import com.zonsim.dagger2_demo.demo2.Demo2Component;
import com.zonsim.dagger2_demo.demo2.Demo2Student;

import javax.inject.Inject;

/**
 * "@Inject" 注解构造函数Demo
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

public class Demo2Activity extends AppCompatActivity {
    
    @Inject
    Demo2Student mDemo2Student;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1_activity);
        
        DaggerDemo2Component.create().inject(this);
        
        System.out.println("name: " + mDemo2Student.getName());
    }
    
    
}
