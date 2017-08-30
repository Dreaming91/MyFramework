package hy.com.myframework.demo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import hy.com.myframework.demo.bean.FragmentInfo;

/**
 * Created by 杂兵
 * 描述：底部Tab专用
 * adapter一定是与list<bean>进行组合
 * **/

public class TablayoutAdapter extends FragmentStatePagerAdapter {

    private List<FragmentInfo> mShowItems = new ArrayList<>();

    public TablayoutAdapter(FragmentManager fm, List<FragmentInfo> showItems) {
        super(fm);
        mShowItems = showItems;
    }


    @Override
    public Fragment getItem(int position) {
        return mShowItems.get(position).fragment;
    }

    @Override
    public int getCount() {
        return mShowItems.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mShowItems.get(position).title;
    }
}
