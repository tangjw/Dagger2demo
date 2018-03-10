package com.zonsim.dagger2_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zonsim.dagger2_demo.demo1.Demo1Activity;
import com.zonsim.dagger2_demo.demo2.Demo2Activity;
import com.zonsim.dagger2_demo.demo3.Demo3Activity;
import com.zonsim.dagger2_demo.demo4.Demo4Activity;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void demo1(View view) {
        startActivity(new Intent(this, Demo1Activity.class));
    }
    
    public void demo2(View view) {
        startActivity(new Intent(this, Demo2Activity.class));
    }
    
    public void demo3(View view) {
        startActivity(new Intent(this, Demo3Activity.class));
    }
    
    public void demo4(View view) {
        startActivity(new Intent(this, Demo4Activity.class));
    }
    
    
}
