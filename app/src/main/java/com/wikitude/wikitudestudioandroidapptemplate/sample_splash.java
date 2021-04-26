package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class sample_splash extends Activity {

    private final int DURACION_SPLASH = 8000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.sample_splahs);


        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(sample_splash.this, sample_menu_principal.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}

