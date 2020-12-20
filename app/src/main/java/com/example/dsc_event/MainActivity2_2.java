package com.example.dsc_event;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2_2 extends AppCompatActivity {
CardView cv1,cv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_2);
        CardView cv1 = (CardView) findViewById(R.id.cv_1);
        CardView cv2 = (CardView) findViewById(R.id.cv_2);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/yeb-odga-wkr"));
                startActivity(browserIntent);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/yeb-odga-wkr"));
                startActivity(browserIntent);
            }
        });

    }
}