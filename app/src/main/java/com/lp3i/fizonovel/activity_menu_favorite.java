package com.lp3i.fizonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class activity_menu_favorite extends AppCompatActivity {
    TextView menudetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_favorite);

        menudetail = findViewById(R.id.menu_detail);
        menudetail.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(activity_menu_favorite.this, activity_detail.class);
                startActivity(intent);
                return false;
            }
        });
    }
}