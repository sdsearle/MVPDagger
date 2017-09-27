package com.example.admin.mvpdagger.view.mainactivity;

import com.example.admin.mvpdagger.BasePresenter;
import com.example.admin.mvpdagger.BaseView;

/**
 * Created by admin on 9/26/2017.
 */

public interface MainActivityContract {
    interface  View extends BaseView{
        void updateView(String s);
    }

    interface Presenter extends BasePresenter<View>{
        void validateInput(String inputString);
    }

}
