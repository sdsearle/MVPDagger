package com.example.admin.mvpdagger.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.mvpdagger.R;
import com.example.admin.mvpdagger.injection.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private static final String TAG = "MaintActivityTag";

    @BindView(R.id.etInputString)
    EditText etInputString;

    @BindView(R.id.tvOutputString)
    TextView tvOutputString;

    @BindView(R.id.btnUpdateView)
    Button btnUpdateView;

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //DaggerMainComponent -- name of object graph
        setupDaggerComponent();

        presenter.attachView(this);
    }

    private void setupDaggerComponent() {
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String s) {
        Log.d(TAG, "showError: " + s);
    }

    @Override
    public void updateView(String s) {
        tvOutputString.setText(s);

    }

    @OnClick(R.id.btnUpdateView)
    public void updateView(View view) {
        presenter.validateInput(etInputString.getText().toString());
    }
}
