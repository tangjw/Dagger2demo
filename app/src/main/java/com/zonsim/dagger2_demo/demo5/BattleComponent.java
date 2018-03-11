package com.zonsim.dagger2_demo.demo5;

import com.zonsim.dagger2_demo.demo5.War;

import dagger.Component;

/**
 * desc
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

@Component(modules = BraavosModule.class)
public interface BattleComponent {
    War getWar();
    
    Cash getCash();
    
    Soldiers getSoliders();
}
