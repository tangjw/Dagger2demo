package com.zonsim.dagger2_demo.demo2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * "@Inject" 注解无参构造函数Demo，module如果只提供Student可以不写
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

@Module
public class Demo2Module {
    
    @Singleton
    @Provides
    Demo2Student providesDemo2Student() {
        return new Demo2Student();
    }
    
}
