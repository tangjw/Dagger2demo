package com.zonsim.dagger2_demo.demo3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zonsim.dagger2_demo.R;
import com.zonsim.dagger2_demo.demo1.Demo1Student;
import com.zonsim.dagger2_demo.demo2.Demo2Student;

import javax.inject.Inject;

/**
 * desc
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

@SuppressLint("Registered")
public class Demo3Activity extends AppCompatActivity {
    
    @Inject
    Demo1Student mDemo1Student;
    @Inject
    Demo2Student mDemo2Student;
    @Inject
    Demo3Student mDemo3Student;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1_activity);
        
        DaggerDemo3Component.builder()
                .demo3Module(new Demo3Module(3, "王五"))
                .build()
                .inject(this);
        
        System.out.println("name: " + mDemo1Student.getName());
        System.out.println("name: " + mDemo2Student.getName());
        System.out.println("name: " + mDemo3Student.getName());
    }
    
    
}
