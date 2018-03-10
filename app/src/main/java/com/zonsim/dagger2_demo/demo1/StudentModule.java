package com.zonsim.dagger2_demo.demo1;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * desc
 *
 * @author tangjunwei tjwabc@gmail.com
 * @email 
 * Created by home-pc on 2018/3/10.
 */

@Module
public class StudentModule {
    
    @Singleton
    @Provides
    Student providesStudent() {
        return new Student();
    }
    
}
