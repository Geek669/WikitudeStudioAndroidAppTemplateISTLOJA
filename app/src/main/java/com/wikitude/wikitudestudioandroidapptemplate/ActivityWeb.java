package com.wikitude.wikitudestudioandroidapptemplate;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends Activity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa);
        wv1=(WebView)findViewById(R.id.webview);
        String url=("https://www.google.com/search?q=instituto%20superior%20tecnologico%20loja%20direccion&rlz=1C1OKWM_esEC910EC910&ei=vd5rYLXqH8S8sAX076aYCg&oq=instituto+superior+tecnologico+loja+dire&gs_lcp=Cgdnd3Mtd2l6EAMYADIGCAAQFhAeOgIIADoCCCZQmQVYlgpgshFoAHACeACAAY4CiAHnCpIBBTAuNC4zmAEAoAEBqgEHZ3dzLXdpesABAQ&sclient=gws-wiz&tbs=lf:1,lf_ui:2&tbm=lcl&rflfq=1&num=10&rldimm=409998869106450525&lqi=Ci1pbnN0aXR1dG8gc3VwZXJpb3IgdGVjbm9sb2dpY28gbG9qYSBkaXJlY2Npb24iAkgBWkoKI2luc3RpdHV0byBzdXBlcmlvciB0ZWNub2xvZ2ljbyBsb2phIiNpbnN0aXR1dG8gc3VwZXJpb3IgdGVjbm9sb2dpY28gbG9qYZIBA2l1dJoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VOUlowcG1hVVZuRUFFqgErEAEqJyIjaW5zdGl0dXRvIHN1cGVyaW9yIHRlY25vbG9naWNvIGxvamEoDg&ved=2ahUKEwjYwPC93-jvAhUFb60KHVdWBL4QvS4wAXoECAQQLg&rlst=f#rlfi=hd:;si:409998869106450525,l,Ci1pbnN0aXR1dG8gc3VwZXJpb3IgdGVjbm9sb2dpY28gbG9qYSBkaXJlY2Npb24iAkgBWkoKI2luc3RpdHV0byBzdXBlcmlvciB0ZWNub2xvZ2ljbyBsb2phIiNpbnN0aXR1dG8gc3VwZXJpb3IgdGVjbm9sb2dpY28gbG9qYZIBA2l1dJoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VOUlowcG1hVVZuRUFFqgErEAEqJyIjaW5zdGl0dXRvIHN1cGVyaW9yIHRlY25vbG9naWNvIGxvamEoDg;mv:[[-3.9065236,-79.17506019999999],[-4.3525684,-79.5779814]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2");//Recuperar valores que el usuario Envio
        wv1.setWebViewClient(new WebViewClient());//Para que no habra con ningun navegador
        wv1.loadUrl(url);//concatenamos con el url

    }
    public void Cerrar(View v){
        finish();//finaliza el activiti en el que estamos y nos manda al primer activity
    }
}

