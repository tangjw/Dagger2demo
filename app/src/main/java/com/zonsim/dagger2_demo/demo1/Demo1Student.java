package com.zonsim.dagger2_demo.demo1;

import javax.inject.Inject;

/**
 * "@Inject" 注解构造无参Demo
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

public class Demo1Student {
    
    private int no;
    
    private String name;
    
    @Inject
    public Demo1Student() {
        this.no = 1;
        this.name = "张三";
    }
    
    public int getNo() {
        return no;
    }
    
    public void setNo(int no) {
        this.no = no;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
