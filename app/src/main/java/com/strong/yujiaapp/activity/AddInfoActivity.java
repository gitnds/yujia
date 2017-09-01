package com.strong.yujiaapp.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.strong.yujiaapp.R;
import com.strong.yujiaapp.base.BaseActivity;

public class AddInfoActivity extends BaseActivity {

    private LinearLayout ll_return;
    private TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addinfo);
        getSupportActionBar().hide();

        initView();
        initData();
        initEvent();

    }
    public void initView(){
        ll_return = (LinearLayout) findViewById(R.id.ll_return);
        tv_title = (TextView) findViewById(R.id.tv_title);
    }
    public void initData(){
        tv_title.setText("新增地址");
    }
    public void initEvent() {

        ll_return.setOnClickListener(returnClickListener);
    }
}
