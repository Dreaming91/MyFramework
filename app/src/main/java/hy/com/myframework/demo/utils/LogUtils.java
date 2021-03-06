package hy.com.myframework.demo.utils;

import android.util.Log;

/*
 * Created by 杂兵
 * 描述：打印日志
 **/
//日志工具类
//在正式发布的时候不能打印日志
// 在测试的时候需要把所有的日志打开
public class LogUtils {

    //日志开关
    public static final boolean isShowLog = false;

    public static final String tag = "project_name";

    //日志打印i级别
    public static void i(String message) {
        if (isShowLog) {
            Log.i(tag, message);
        }
    }

}
