package com.zonsim.dagger2_demo.demo3;

import com.zonsim.dagger2_demo.demo2.Demo2Module;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 关联 module
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

@Singleton
@Component(modules = {Demo2Module.class, Demo3Module.class})
public interface Demo3Component {
    void inject(Demo3Activity demo3Activity);
}
