package com.example.dllo.yuliao.ui.fragment;

import android.os.Bundle;

import com.example.dllo.yuliao.R;

/**
 * Created by dllo on 16/10/18.
 */
public class Z_VideoFragment extends AbsBaseFragment {

    public static Z_VideoFragment newInstance() {
        
        Bundle args = new Bundle();
        
        Z_VideoFragment fragment = new Z_VideoFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_video;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initDatas() {

    }
}
