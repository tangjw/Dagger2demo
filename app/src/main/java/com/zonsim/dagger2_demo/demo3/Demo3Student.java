package com.zonsim.dagger2_demo.demo3;

import javax.inject.Inject;

/**
 * 有参构造 不能直接"@Inject",必须写 module 提供
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */
public class Demo3Student {
    
    private int no;
    
    private String name;
    
    public Demo3Student(int no, String name) {
        this.no = no;
        this.name = name;
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
