package com.example.dllo.yuliao.ui.fragment;

import android.os.Bundle;

import com.example.dllo.yuliao.R;

/**
 * Created by dllo on 16/10/18.
 */
public class Z_ChatFragment extends AbsBaseFragment {

    public static Z_ChatFragment newInstance() {
        
        Bundle args = new Bundle();
        
        Z_ChatFragment fragment = new Z_ChatFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_chat;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initDatas() {

    }
}
