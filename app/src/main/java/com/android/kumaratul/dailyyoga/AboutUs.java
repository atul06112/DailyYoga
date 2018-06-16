package com.android.kumaratul.dailyyoga;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    TextView t1,t2;RatingBar r;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        t1=(TextView)findViewById(R.id.textView7);
        t2=(TextView)findViewById(R.id.textView8);
        String data="DAILY YOGA App is a true yoga app for beginners to advanced,this fitness app facilitates the most convenient home exercises,not only nourishes " +
                "your health but also spares you all the tiresome workouts and help you achieve fitness goals with yoga...";
        t1.setText(data);
        r=(RatingBar)findViewById(R.id.ratingBar);
        b=(Button)findViewById(R.id.button24);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(r.getRating());
                s="Your rating is:-"+s+"\n"+"THANK YOU SO MUCH";
                t2.setText(s);
                android.support.v4.app.NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplication()).setSmallIcon(R.drawable.pic)
                        .setContentTitle("Dail Yoga").setContentText("Thanks for the rating,Do Yoga Daily And be fit.");
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                PendingIntent contentIntent=PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(contentIntent);
                NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0,builder.build());
            }
        });
    }
}
