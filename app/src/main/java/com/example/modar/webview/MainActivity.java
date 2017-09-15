package com.example.modar.webview;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit1;
    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText)findViewById(R.id.textView);
        web1 = (WebView)findViewById(R.id.webview);

    }

    public void btn_click(View view){

        String url = edit1.getText().toString();
        web1.setWebViewClient(new WebViewClient());  // to load the page in the same webview
        web1.getSettings().setJavaScriptEnabled(true); // enable java in browser so you can open most webpages
        web1.loadUrl(url);

    }


}
