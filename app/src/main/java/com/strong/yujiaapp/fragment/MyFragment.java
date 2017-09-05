package com.strong.yujiaapp.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.strong.yujiaapp.R;
import com.strong.yujiaapp.activity.HumanInfoActivity;
import com.strong.yujiaapp.activity.SendActivity;

/**
 * Created by Administrator on 2017/8/23.
 */

public class MyFragment extends Fragment {

    public Activity mActivity;
    private LinearLayout ll_return;
    private TextView tv_title,tv_myorder,tv_myloc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mActivity = getActivity();//获取当前fragment依赖的activity
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        ll_return = view.findViewById(R.id.ll_return);
        tv_title = view.findViewById(R.id.tv_title);
        tv_myorder = view.findViewById(R.id.tv_myorder);
        tv_myloc = view.findViewById(R.id.tv_myloc);

        initData();
        initEvent();

        return view;
    }


    public void initData(){

        tv_title.setText("我");
    }

    public void initEvent(){

        tv_myorder.setOnClickListener(myorderClickListener);
        tv_myloc.setOnClickListener(mylocClickListener);
    }

    View.OnClickListener myorderClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(mActivity, SendActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener mylocClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(mActivity, HumanInfoActivity.class);
            startActivity(intent);
        }
    };

}
