package hy.com.myframework.demo.utils;

import android.widget.Toast;

import hy.com.myframework.demo.gloab.MyApp;

/**
 * Created by 杂兵
 * 描述：强大的吐司，能够连续弹的吐司
 */
public class ToastUtil {
    private static Toast toast;

    /**
     * @param text
     */
    public static void showToast(final String text) {
        Utils.runOnUIThread(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(MyApp.context, text, Toast.LENGTH_SHORT);
                } else {
                    toast.setText(text);//如果不为空，则直接改变当前toast的文本
                }
                toast.show();
            }
        });

    }
}
