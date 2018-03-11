package com.zonsim.dagger2_demo.demo5;

import dagger.Module;
import dagger.Provides;

/**
 * desc
 * <p>
 * Created by tangjunwei on 2018/3/11.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */

@Module
public class BraavosModule {
    
    Cash mCash;
    
    Soldiers mSoldiers;
    
    public BraavosModule(Cash cash, Soldiers soldiers) {
        mCash = cash;
        mSoldiers = soldiers;
    }
    
    //Provides cash dependency
    @Provides
    Cash provideCash() {
        return mCash;
    }
    
    //provides soldiers dependency
    @Provides
    Soldiers provideSoldiers() {
        return mSoldiers;
    }
}
