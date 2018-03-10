package com.zonsim.dagger2_demo.demo1;

import javax.inject.Inject;

/**
 * desc
 *
 * @author tangjunwei
 * @email tjwabc@gmail.com
 * Created by home-pc on 2018/3/10.
 */

public class Student {
    
    private int no;
    
    private String name;
    
    @Inject
    public Student() {
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
