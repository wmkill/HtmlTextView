package top.dever.picupload;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import top.dever.picupload.txtorimg.HtmlTextView;

public class MainActivity extends Activity {
    private HtmlTextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_text=(HtmlTextView) findViewById(R.id.tv);
        String html = "下面是图片了 " +
                "<img src='http://www.qqpk.cn/Article/UploadFiles/201411/20141116135722282.jpg'/>" +
                "这也是图片" +
                "<img src='http://h.hiphotos.baidu.com/image/pic/item/d000baa1cd11728b2027e428cafcc3cec3fd2cb5.jpg'/>;" +
                "还有一张"+
                "<img src='http://img.61gequ.com/allimg/2011-4/201142614314278502.jpg'/>";
        Log.d("html", html);
        tv_text.setHtmlFromString(html,false);
    }
}

