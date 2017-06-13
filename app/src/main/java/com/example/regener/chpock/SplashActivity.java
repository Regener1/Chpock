package com.example.regener.chpock;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

import static com.nineoldandroids.view.ViewPropertyAnimator.animate;

public class SplashActivity extends AppCompatActivity {

    private Display display;
    private DisplayMetrics displayMetrics;

    private View viewFlyingMug;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        display = this.getWindowManager().getDefaultDisplay();
        displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);

        viewFlyingMug = (View) findViewById(R.id.activitySplash_View_FlyingMug);

        viewFlyingMug.setX(displayMetrics.widthPixels / 3);
        viewFlyingMug.setY(displayMetrics.heightPixels);

//        int startPointX = displayMetrics.widthPixels / 3;
//        int startPointY = displayMetrics.heightPixels - (displayMetrics.heightPixels * 2 / 3);
//
//        final int[][] ellipcePoint = new int[5][2]; //x y
//
//        int radius = 100;
//        int alpha = 0;
//        int dAlpha = -25;
//        for(int i = 0; i < ellipcePoint.length; i++){
//            ellipcePoint[i][0] = startPointX + (int)(radius * Math.sin(Math.toRadians(alpha)));
//            ellipcePoint[i][1] = startPointY + (int)(radius * Math.cos(Math.toRadians(alpha)));
//
//            alpha += dAlpha;
//        }



//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                if(i == ellipcePoint.length - 1){
//                    return;
//                }
//
//                animate(viewFlyingMug).setDuration(100).x(ellipcePoint[i][0]).y(ellipcePoint[i][1]);
//                i++;
//
//                Log.i("animation", "i " + i);
//
//            }
//        }, 0, 200);

//        long delay = 0;
//        //to up 1 point
//        animate(viewFlyingMug).setDuration(1500).y(startPointY);
//        delay += 1500;
//        for(int i = 0; i < ellipcePoint.length; i++){
//            animate(viewFlyingMug).setDuration(1000).x(ellipcePoint[i][0]).y(ellipcePoint[i][1]);
//            Log.i("animation", "x " + ellipcePoint[i][0] + " y " + ellipcePoint[i][1]);
//            delay += 1000;
//        }
    }

}
