package com.example.dllo.yuliao.ui.fragment;

import android.os.Bundle;

import com.example.dllo.yuliao.R;

/**
 * Created by dllo on 16/10/18.
 */
public class Z_MapFragment extends AbsBaseFragment {

    public static Z_MapFragment newInstance() {
        
        Bundle args = new Bundle();
        
        Z_MapFragment fragment = new Z_MapFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_map;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initDatas() {

    }
}
