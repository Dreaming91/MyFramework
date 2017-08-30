package hy.com.myframework.demo.bean;

import android.support.v4.app.Fragment;

/**
 * Created by 杂兵
 * 描述:资讯显示的bean
 **/

public class FragmentInfo {
    //fragment
    public Fragment fragment;
    //title
    public String title;

    public FragmentInfo(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }
}
