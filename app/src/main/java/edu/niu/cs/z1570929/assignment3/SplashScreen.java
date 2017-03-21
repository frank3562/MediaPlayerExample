package edu.niu.cs.z1570929.assignment3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {
                finish();
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }//end of run
        };//end of TimerTask

        Timer timer = new Timer();
        timer.schedule(task, 5000);




    }//end of onCreate
}//end of SplashActivity
