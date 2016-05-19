package top.dever.picupload;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by Android Studio
 * Time: 2016/5/19 15:52
 * Author: wangmeng
 */
public class AppAplication extends Application {

    private ImageLoader imageLoader = ImageLoader.getInstance();
    @Override
    public void onCreate() {
        super.onCreate();
        imageLoader.init(ImageLoaderConfiguration.createDefault(getApplicationContext()));
    }
}
