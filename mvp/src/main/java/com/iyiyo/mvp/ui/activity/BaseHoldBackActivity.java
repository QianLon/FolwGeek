package com.iyiyo.mvp.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;

import com.iyiyo.mvp.R;
import com.iyiyo.nucleus.presenter.Presenter;

public abstract class BaseHoldBackActivity<P extends Presenter> extends BaseActivity<P> {

    protected Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view;

        setContentView(view = getLayoutInflater().inflate(onBindLayout(), null));

        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);

        mToolbar.setTitle("");
        mToolbar.setSubtitle(onSetTitle());
        mToolbar.setNavigationIcon(R.mipmap.ic_back);
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    protected abstract String onSetTitle();

    protected abstract int onBindLayout();

}
