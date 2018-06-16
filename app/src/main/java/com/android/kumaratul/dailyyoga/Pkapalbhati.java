package com.android.kumaratul.dailyyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Pkapalbhati extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pkapalbhati);
        w=(WebView)findViewById(R.id.p2);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("https://www.youtube.com/watch?v=_kdhsfDEuY8");
    }
}
