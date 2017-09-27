package com.example.admin.mvpdagger.injection.mainactivity;

import com.example.admin.mvpdagger.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 9/26/2017.
 */

@Module
public class MainActivityModule {

    //add the dependencies using the @provides for each method
    @Provides
    MainActivityPresenter getMainActivityPresenter(){
        return new MainActivityPresenter();
    }



}
