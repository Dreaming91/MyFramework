package hy.com.myframework.demo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import hy.com.myframework.demo.ui.fragment.BaseFragment;
import hy.com.myframework.demo.utils.Fields;


/**
 * Created by 杂兵
 * 描述：activity基类
 **/

public class BaseActivity extends AppCompatActivity {
    //完整的显示一个fragment
    public void startFragment(Class<? extends BaseFragment> fragmentClass, String title, Bundle bundle, boolean isShowActionbar, boolean isArrow) {
        Intent intent = new Intent(this, ShowActivity.class);
        //这个数据包给展示的fragment

        intent.putExtra(Fields.showActivity.bundle, bundle);

        //单独传递数据给activity
        intent.putExtra(Fields.showActivity.className, fragmentClass);
        intent.putExtra(Fields.showActivity.isShowActionbar, isShowActionbar);
        intent.putExtra(Fields.showActivity.title, title);
        intent.putExtra(Fields.showActivity.isArrow, isArrow);
        startActivity(intent);
    }

}
