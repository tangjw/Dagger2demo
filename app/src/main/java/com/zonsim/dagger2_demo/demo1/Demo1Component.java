package com.zonsim.dagger2_demo.demo1;

import javax.inject.Singleton;

import dagger.Component;

/**
 * "@Inject" 注解无参构造函数Demo，
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

@Singleton
@Component/*(modules = Demo1Module.class)*/
public interface Demo1Component {
    void inject(Demo1Activity demo1Activity);
}
