package com.takatutustudio.Donasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SuccessDonateActivity extends AppCompatActivity {
    Animation app_splash, btt, ttb;
    Button btn_view_ticket, btn_my_dashboard;
    TextView app_title, app_subtitle;
    ImageView icon_succes_ticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_donate);

        btn_view_ticket = findViewById(R.id.btn_view_ticket);
        btn_my_dashboard = findViewById(R.id.btn_my_dashboard);
        app_title = findViewById(R.id.app_title);
        app_subtitle = findViewById(R.id.app_subtitle);
        icon_succes_ticket = findViewById(R.id.icon_succes_ticket);

        //Load Animation
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);

        //Run Animation
        icon_succes_ticket.startAnimation(app_splash);

        app_title.startAnimation(ttb);
        app_subtitle.startAnimation(ttb);

        btn_view_ticket.startAnimation(btt);
        btn_my_dashboard.startAnimation(btt);

        //berpindah Activity MyProfile
        btn_view_ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoprofile = new Intent(getApplicationContext(), MyProfileActivity.class);
                startActivity(gotoprofile);
            }
        });

        //berpindah Activity Home
        btn_my_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(gotohome);
            }
        });

    }

}
