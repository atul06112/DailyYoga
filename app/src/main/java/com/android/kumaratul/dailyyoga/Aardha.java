package com.android.kumaratul.dailyyoga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Aardha extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aardha);
        w=(WebView)findViewById(R.id.a3);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("https://www.youtube.com/watch?v=i_ix1f99Vn4&list=PLBG6UuYpOcTtJuejaJLPYjhEcjdslRWGY&index=7");
    }
}
