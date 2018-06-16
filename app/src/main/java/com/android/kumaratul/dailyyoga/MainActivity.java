package com.android.kumaratul.dailyyoga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.red:
                Intent i=new Intent(MainActivity.this,Asana.class);
                startActivity(i);
                break;
            case R.id.green:
                Intent i1=new Intent(MainActivity.this,Pranayam.class);
                startActivity(i1);
                break;
            case R.id.black:
                Intent i2=new Intent(MainActivity.this,AboutUs.class);
                startActivity(i2);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
