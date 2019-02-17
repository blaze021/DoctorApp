package com.example.doctorapp;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView title,obj2,obj3,obj4,logo;
    Animation fromtop,frombottom,fromleft,fromright;
    private int sleep_timer =4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //  title= findViewById(R.id.title_ob);
       // obj2 = findViewById(R.id.bottom_ob);
        obj3 = findViewById(R.id.left_ob);
        obj4 = findViewById(R.id.right_ob);
        logo = findViewById(R.id.logo);


        fromtop = AnimationUtils.loadAnimation(this,R.anim.frontop);
        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromleft = AnimationUtils.loadAnimation(this,R.anim.fromleft);
        fromright = AnimationUtils.loadAnimation(this,R.anim.fromright);

       // title.setAnimation(fromtop);
        //obj2.setAnimation(frombottom);
        obj3.setAnimation(fromleft);
        obj4.setAnimation(fromright);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();
            }
        },sleep_timer);
    }
}
