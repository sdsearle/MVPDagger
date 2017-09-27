package com.example.admin.mvpdagger.view.mainactivity;

/**
 * Created by admin on 9/26/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view;

    @Override
    public void attachView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void validateInput(String inputString) {

        String outputString = "$" + inputString;

        if (inputString.equals("error"))
            view.updateView(outputString);
        else
            view.updateView(inputString);

    }
}
