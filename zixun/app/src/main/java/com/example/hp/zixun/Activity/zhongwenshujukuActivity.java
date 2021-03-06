package com.example.hp.zixun.Activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.hp.zixun.R;

public class zhongwenshujukuActivity extends Activity {

    WebView webView;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhongwenshujuku_main);

        webView= (WebView) findViewById(R.id.zhongwenshujuku);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);//允许运行JavaScript

        webView.loadUrl("http://library.shou.edu.cn/705/list.htm");             //加载外网
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
