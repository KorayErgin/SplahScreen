package com.yamankod.splahscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

/**
 * Created by murat on 25.11.2016.
 */
public class Splash extends Activity {


    private Intent intentmain;

    private static final String TAG = "_Splash";
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.splash);

        startHandler();

    }
    public void startHandler(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "Hanler run() for 3 second");

                intentmain =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentmain);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }


}
