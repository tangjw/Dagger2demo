package com.zonsim.dagger2_demo.demo3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * desc
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

@Module
public class Demo3Module {
    
    private int no;
    
    private String name;
    
    public Demo3Module(int no, String name) {
        this.no = no;
        this.name = name;
    }
    
    @Singleton
    @Provides
    Demo3Student providesDemo3Student() {
        return new Demo3Student(no, name);
    }
    
    /*@Singleton
    @Provides
    Demo3Student providesDemo3Student(int no, String name) {
        return new Demo3Student(no, name);
    }*/
    
}
