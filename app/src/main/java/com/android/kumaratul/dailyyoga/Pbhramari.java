package com.android.kumaratul.dailyyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Pbhramari extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbhramari);
        w=(WebView)findViewById(R.id.p3);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("https://www.youtube.com/watch?v=rd590U_4fII");
    }
}
