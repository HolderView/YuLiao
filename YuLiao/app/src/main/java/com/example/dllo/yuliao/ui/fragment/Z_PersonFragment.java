package com.example.dllo.yuliao.ui.fragment;

import android.os.Bundle;

import com.example.dllo.yuliao.R;

/**
 * Created by dllo on 16/10/18.
 */
public class Z_PersonFragment extends AbsBaseFragment {

    public static Z_PersonFragment newInstance() {

        Bundle args = new Bundle();

        Z_PersonFragment fragment = new Z_PersonFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_person;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initDatas() {

    }
}
