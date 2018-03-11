package com.zonsim.dagger2_demo.demo5;

import javax.inject.Inject;

/**
 * desc
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

public class Starks implements IHouse {
    
    @Inject
    public Starks() {
    }
    
    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }
    
    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}
