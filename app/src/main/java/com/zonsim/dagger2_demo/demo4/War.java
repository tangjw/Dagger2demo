package com.zonsim.dagger2_demo.demo4;

import javax.inject.Inject;

/**
 * desc
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */
public class War {
    
    private Starks mStarks;
    
    private Boltons mBoltons;
    
    @Inject
    public War(Starks starks, Boltons boltons) {
        mStarks = starks;
        mBoltons = boltons;
    }
    
    public void prepare() {
        mStarks.prepareForWar();
        mBoltons.prepareForWar();
    }
    
    public void report() {
        mStarks.reportForWar();
        mBoltons.reportForWar();
    }
    
}
