package com.example.aqpgo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash_AqpGo_Activity extends Activity {

    private final int DURACION_SPLASH = 5000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash__aqp_go_);

        new Handler().postDelayed(new Runnable(){
            public void run(){

                Intent intent = new Intent(Splash_AqpGo_Activity.this, ListRestauranteActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}