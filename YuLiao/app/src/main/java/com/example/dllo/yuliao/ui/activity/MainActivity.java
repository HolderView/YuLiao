package com.example.dllo.yuliao.ui.activity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.dllo.yuliao.R;
import com.example.dllo.yuliao.ui.fragment.Z_ChatFragment;
import com.example.dllo.yuliao.ui.fragment.Z_MapFragment;
import com.example.dllo.yuliao.ui.fragment.Z_PersonFragment;
import com.example.dllo.yuliao.ui.fragment.Z_VideoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AbsBaseActivity {

    private ViewPager mainVp;
    private TabLayout mainTl;
    private List<Fragment> fragments;


    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        mainVp = byView(R.id.main_vp);
        mainTl = byView(R.id.main_tl);
    }

    @Override
    protected void initData() {
        fragments = new ArrayList<>();
        fragments.add(Z_ChatFragment.newInstance());
        fragments.add(Z_MapFragment.newInstance());
        fragments.add(Z_VideoFragment.newInstance());
        fragments.add(Z_PersonFragment.newInstance());

        VpSetAdapter();
        mainTl.setupWithViewPager(mainVp);
        mainTl.setTabTextColors(Color.BLACK,Color.parseColor("#56abe4"));

        mainTl.getTabAt(0).setText("聊天").setIcon(R.drawable.selector_chat);
        mainTl.getTabAt(1).setText("地图").setIcon(R.drawable.selector_map);
        mainTl.getTabAt(2).setText("视频").setIcon(R.drawable.selector_video);
        mainTl.getTabAt(3).setText("个人").setIcon(R.drawable.selector_person);

    }

    private void VpSetAdapter() {
        mainVp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
    }
}
