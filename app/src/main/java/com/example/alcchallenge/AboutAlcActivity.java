package com.example.alcchallenge;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class AboutAlcActivity extends AppCompatActivity {

    private ProgressBar myProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        myProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://andela.com/alc/");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                //super.onReceivedSslError(view, handler, error);
                handler.proceed();
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                myProgressBar.setVisibility(view.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                myProgressBar.setVisibility(view.INVISIBLE);
            }
        });

    }

}
