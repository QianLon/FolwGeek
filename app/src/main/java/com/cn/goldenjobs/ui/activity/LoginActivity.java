package com.cn.goldenjobs.ui.activity;

import android.support.design.widget.TextInputLayout;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.Toast;

import com.cn.goldenjobs.R;
import com.iyiyo.mvc.ui.activity.BaseHoldBackActivity;

import butterknife.Bind;

public class LoginActivity extends BaseHoldBackActivity {

    @Bind(R.id.et_username)
    TextInputLayout etUsername;
    @Bind(R.id.et_password)
    TextInputLayout etPassword;
    @Bind(R.id.btn_submit)
    Button btnSubmit;

    @Override
    public int getResourceId() {
        return R.layout.activity_login;
    }

    @Override
    public void initToolBar() {
        super.initToolBar();
        mToolbar.setSubtitle("登录");
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(int v) {
        if (v == R.id.btn_submit){
            // 校验
            String username = etUsername.getEditText().getText().toString();
            String password = etPassword.getEditText().getText().toString();
            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
                Toast.makeText(this, "账号/密码不能为空", Toast.LENGTH_SHORT).show();
                return;
            }
            finish();
        }
    }
}
