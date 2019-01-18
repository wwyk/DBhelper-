package com.example.hp.zixun;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class baoxiaoActivity extends Activity {

    WebView webView;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baoxiao_main);

        webView= (WebView) findViewById(R.id.baoxiao);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);//允许运行JavaScript

        webView.loadUrl("http://ggws.shou.edu.cn/RBS/Student/CDxsbx.aspx");             //加载外网
        webView.setWebViewClient(new HelloWebViewClient ());
        //webView.loadUrl("file:///android_asset/XX.html");   //本地网站
    }

    @Override
    //设置回退
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack(); //调用goBack()返回WebView的上一页面
            return true;
        }
        else{
            System.exit(0); //退出程序
        }
        return super.onKeyDown(keyCode,event);
    }

    //Web视图
    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
