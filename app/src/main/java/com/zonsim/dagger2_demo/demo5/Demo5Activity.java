package com.zonsim.dagger2_demo.demo5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * desc
 * <p>
 * Created by tangjunwei on 2018/3/10.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */
public class Demo5Activity extends AppCompatActivity {
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Cash cash = new Cash();
    
        Soldiers soldiers = new Soldiers();
    
        BattleComponent component = DaggerBattleComponent.builder()
                .braavosModule(new BraavosModule(cash, soldiers))
                .build();
    
        War war = component.getWar();
        
        war.prepare();
        war.report();
    
        component.getCash();
        component.getSoliders();
        
    }
}
