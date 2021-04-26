package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sample_menu_principal extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.menu_principal_);


    }
    public void inicio(View v){
        Intent intent = new Intent(v.getContext(), RuntimePermissionRequestActivity.class);
        startActivityForResult(intent,0);
    }
    public void ayuda (View vi){
        Intent ayuda = new Intent(this, sample_ayuda.class);
        startActivityForResult(ayuda,0);
    }
    public void pasar (View vi){
        Intent ayuda = new Intent(this, sample_nosotros.class);
        startActivityForResult(ayuda,0);
    }
    public void map (View vi){
        Intent ayuda = new Intent(this, ActivityWeb.class);
        startActivityForResult(ayuda,0);
    }
}


