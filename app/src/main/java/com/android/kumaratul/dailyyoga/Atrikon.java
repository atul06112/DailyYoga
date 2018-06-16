package com.android.kumaratul.dailyyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Atrikon extends AppCompatActivity {
     WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atrikon);
        w=(WebView)findViewById(R.id.a4);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("https://www.youtube.com/watch?v=misHjEvOskI&list=PLBG6UuYpOcTtJuejaJLPYjhEcjdslRWGY&index=6");
    }
}
