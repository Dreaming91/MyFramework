package hy.com.myframework.demo.gloab;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by 杂兵
 * 描述：全局设置
 **/

public class MyApp extends Application {
    public static Context context;
    public static Handler mainHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        mainHandler = new Handler();
    }
}
