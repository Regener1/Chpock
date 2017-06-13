package com.example.regener.chpock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import static com.nineoldandroids.view.ViewPropertyAnimator.animate;

public class SplashActivity extends AppCompatActivity {

    private Display display;
    private DisplayMetrics displayMetrics;

    private View viewFlyingMug;

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

        animate(viewFlyingMug).setDuration(2000).y(200);
    }
}
