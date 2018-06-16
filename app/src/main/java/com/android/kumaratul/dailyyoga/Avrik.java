package com.android.kumaratul.dailyyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Avrik extends AppCompatActivity {
     WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avrik);
        w=(WebView)findViewById(R.id.a1);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("https://www.youtube.com/watch?v=fIF016JROiA&list=PLBG6UuYpOcTtJuejaJLPYjhEcjdslRWGY");
    }
}
