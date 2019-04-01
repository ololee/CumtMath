package application;

/**
 *      packageName:  application
 *      className:    BaseApplication
 *      createDate:    2019年4月1日-16点23分
 *      author:    ololee
 *      usage:     初始化bmob云的功能，本app所使用的application必须保证使用的是当前类BaseApplication
 */
import android.app.Application;

import java.lang.annotation.Inherited;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobConfig;


public class BaseApplication extends Application {

    /**
     * APPLICATION_ID   app_id
     * CONNECT_TIME_OUT  连接时间限制
     * BLOCK_SIZE_OF_UPLOAD  每片最大上传大小
     * FILE_EXPIRATION  文件过期时间
     * bmobConfig   bmob的配置变量
     * */
    private static String APPLICATION_ID="d3708be4547d18fbde67272356531ee3";
    private static long CONNECT_TIME_OUT=30;
    private static int BLOCK_SIZE_OF_UPLOAD=1024*1024;
    private static long FILE_EXPIRATION=1800;
    private BmobConfig bmobConfig;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }


    /**
     *
     * 供内部使用的初始化函数
     * */
    private void init()
    {
       bmobConfig= new BmobConfig.Builder(this)
               .setApplicationId(APPLICATION_ID)
               .setConnectTimeout(CONNECT_TIME_OUT)
               .setUploadBlockSize(BLOCK_SIZE_OF_UPLOAD)
               .setFileExpiration(FILE_EXPIRATION)
               .build();
        Bmob.initialize(bmobConfig);
    }
}
