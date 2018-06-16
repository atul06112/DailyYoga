package com.android.kumaratul.dailyyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Apadah extends AppCompatActivity {
     WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apadah);
        w=(WebView)findViewById(R.id.a5);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("https://www.youtube.com/watch?v=_oM_OGcaSRQ&index=9&list=PLBG6UuYpOcTtJuejaJLPYjhEcjdslRWGY");
    }
}
