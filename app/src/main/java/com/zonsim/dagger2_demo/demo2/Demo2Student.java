package com.zonsim.dagger2_demo.demo2;

/**
 * 没有"@Inject" 注解无参构造函数的Demo（普通实体类）
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

public class Demo2Student {
    
    private int no;
    
    private String name;
    
    public Demo2Student() {
        this.no = 2;
        this.name = "李四";
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
