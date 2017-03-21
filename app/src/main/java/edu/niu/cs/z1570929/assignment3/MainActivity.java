/*
Programmer: Franklin Adams
ZID: Z1570929
Date: 4/12/2016
Program name: Assignment3
Function: This program will allow you to select a song to play underneath pictures of the memes of those songs.

All images, descriptions, and ownership of trademarked representations belongs to the the original artists, composers, and actors depicted.
*/

package edu.niu.cs.z1570929.assignment3;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity
{
    //instance variables
    private Button drakeBtn, feulBtn,
                   teardropBtn, hurtBtn,
                   thunderhorseBtn, aroundtheworldBtn;

    private MediaPlayer drakeMP, feulMP,
            teardropMP, hurtMP,
            thunderhorseMP, aroundtheworldMP;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link button objects to screen
        drakeBtn = (Button)findViewById(R.id.drakeButton);
        feulBtn = (Button)findViewById(R.id.feulButton);
        teardropBtn = (Button)findViewById(R.id.teardropButton);
        hurtBtn = (Button)findViewById(R.id.hurtButton);
        thunderhorseBtn = (Button)findViewById(R.id.thunderhorseButton);
        aroundtheworldBtn = (Button)findViewById(R.id.aroundtheworldButton);

        //create MediaPlayer objects
        drakeMP = new MediaPlayer();
        drakeMP = MediaPlayer.create( this, R.raw.drake );

        feulMP = new MediaPlayer();
        feulMP = MediaPlayer.create( this, R.raw.feul );

        teardropMP = new MediaPlayer();
        teardropMP = MediaPlayer.create( this, R.raw.teardrop );

        hurtMP = new MediaPlayer();
        hurtMP = MediaPlayer.create( this, R.raw.hurt );

        thunderhorseMP = new MediaPlayer();
        thunderhorseMP = MediaPlayer.create( this, R.raw.thunderhorse );

        aroundtheworldMP = new MediaPlayer();
        aroundtheworldMP = MediaPlayer.create( this, R.raw.aroundtheworld );


    }//end of onCreate

    //Drake Button Method
    public void doDrake(View view)
    {
        //if the drake mp3 is playing, then it should be paused and the text on the button should be changed
        if( drakeMP.isPlaying() )
        {
            drakeMP.pause();
            drakeBtn.setText( "Play" );
        }
        //otherwise, the drake mp3 is not playing
        //if the any other mp3 is playing, pause it and change the button for drake
        //start the drake mp3
        //change text on drake button
        else
        {
            if( feulMP.isPlaying() || teardropMP.isPlaying() ||
                hurtMP.isPlaying() || thunderhorseMP.isPlaying() ||
                aroundtheworldMP.isPlaying())
            {
                drakeMP.start();
                drakeBtn.setText( "Pause");
                feulMP.pause();
                feulBtn.setText( "Play");
                teardropMP.pause();
                teardropBtn.setText( "Play");
                hurtMP.pause();
                hurtBtn.setText( "Play");
                thunderhorseMP.pause();
                thunderhorseBtn.setText( "Play");
                aroundtheworldMP.pause();
                aroundtheworldBtn.setText( "Play");

            }
            drakeMP.start();
            drakeBtn.setText( "Pause");

        }

    }//end doDrake

    //Feul Button
    public void doFeul(View view)
    {
        //if the feul mp3 is playing, then it should be paused and the text on the button should be changed
        if( feulMP.isPlaying() )
        {
            feulMP.pause();
            feulBtn.setText("Play");
        }
        //otherwise, the feul mp3 is not playing
        //if the any other mp3 is playing, pause it and change the button for drake
        //start the feul mp3
        //change text on feul button
        else
        {
            if( drakeMP.isPlaying() || teardropMP.isPlaying() ||
                hurtMP.isPlaying() || thunderhorseMP.isPlaying() ||
                aroundtheworldMP.isPlaying())
            {
                drakeMP.pause();
                drakeBtn.setText( "Play");
                feulMP.start();
                feulBtn.setText( "Pause");
                teardropMP.pause();
                teardropBtn.setText( "Play");
                hurtMP.pause();
                hurtBtn.setText( "Play");
                thunderhorseMP.pause();
                thunderhorseBtn.setText( "Play");
                aroundtheworldMP.pause();
                aroundtheworldBtn.setText( "Play");
            }
            feulMP.start();
            feulBtn.setText( "Pause");

        }

    }//end doFeul

    //Teardrop Button
    public void doTeardrop(View view)
    {
        //if the teardrop mp3 is playing, then it should be paused and the text on the button should be changed
        if( teardropMP.isPlaying() )
        {
            teardropMP.pause();
            teardropBtn.setText( "Play" );
        }
        //otherwise, the drake mp3 is not playing
        //if the any other mp3 is playing, pause it and change the button for drake
        //start the drake mp3
        //change text on drake button
        else
        {
            if( drakeMP.isPlaying() || feulMP.isPlaying() ||
                hurtMP.isPlaying() || thunderhorseMP.isPlaying() ||
                aroundtheworldMP.isPlaying())
            {
                drakeMP.pause();
                drakeBtn.setText( "Play");
                feulMP.pause();
                feulBtn.setText( "Play");
                teardropMP.start();
                teardropBtn.setText( "Pause");
                hurtMP.pause();
                hurtBtn.setText( "Play");
                thunderhorseMP.pause();
                thunderhorseBtn.setText( "Play");
                aroundtheworldMP.pause();
                aroundtheworldBtn.setText( "Play");
            }
            teardropMP.start();
            teardropBtn.setText( "Pause");

        }

    }//end doTeardrop

    //Hurt Button
    public void doHurt(View view)
    {
        //if the hurt mp3 is playing, then it should be paused and the text on the button should be changed
        if( hurtMP.isPlaying() )
        {
            hurtMP.pause();
            hurtBtn.setText( "Play" );
        }
        //otherwise, the hurt mp3 is not playing
        //if the any other mp3 is playing, pause it and change the button for hurt
        //start the hurt mp3
        //change text on hurt button
        else
        {
            if( drakeMP.isPlaying() || teardropMP.isPlaying() ||
                feulMP.isPlaying() || thunderhorseMP.isPlaying() ||
                aroundtheworldMP.isPlaying())
            {
                drakeMP.pause();
                drakeBtn.setText( "Play");
                feulMP.pause();
                feulBtn.setText( "Play");
                teardropMP.pause();
                teardropBtn.setText( "Play");
                hurtMP.start();
                hurtBtn.setText( "Pause");
                thunderhorseMP.pause();
                thunderhorseBtn.setText( "Play");
                aroundtheworldMP.pause();
                aroundtheworldBtn.setText( "Play");
            }
            hurtMP.start();
            hurtBtn.setText( "Pause");

        }

    }//end doHurt

    //Thunderhorse Button
    public void doThunderhorse(View view)
    {
        //if the thunderhorse mp3 is playing, then it should be paused and the text on the button should be changed
        if( thunderhorseMP.isPlaying() )
        {
            thunderhorseMP.pause();
            thunderhorseBtn.setText( "Play" );
        }
        //otherwise, the thunderhorse mp3 is not playing
        //if the any other mp3 is playing, pause it and change the button for thunderhorse
        //start the thunderhorse mp3
        //change text on thunderhorse button
        else
        {
            if( drakeMP.isPlaying() || teardropMP.isPlaying() ||
                feulMP.isPlaying() || hurtMP.isPlaying() ||
                aroundtheworldMP.isPlaying())
            {
                drakeMP.pause();
                drakeBtn.setText( "Play");
                feulMP.pause();
                feulBtn.setText( "Play");
                teardropMP.pause();
                teardropBtn.setText( "Play");
                hurtMP.pause();
                hurtBtn.setText( "Play");
                thunderhorseMP.start();
                thunderhorseBtn.setText( "Pause");
                aroundtheworldMP.pause();
                aroundtheworldBtn.setText( "Play");
            }
            thunderhorseMP.start();
            thunderhorseBtn.setText( "Pause");

        }

    }//end doThunderhorse

    //Aroundtheworld Button
    public void doAroundtheworld(View view)
    {
        //if the aroundtheworld mp3 is playing, then it should be paused and the text on the button should be changed
        if( aroundtheworldMP.isPlaying() )
        {
            aroundtheworldMP.pause();
            aroundtheworldBtn.setText( "Play" );
        }
        //otherwise, the aroundtheworld mp3 is not playing
        //if the any other mp3 is playing, pause it and change the button for aroundtheworld
        //start the aroundtheworld mp3
        //change text on aroundtheworld button
        else
        {
            if( drakeMP.isPlaying() || teardropMP.isPlaying() ||
                feulMP.isPlaying() || hurtMP.isPlaying() ||
                thunderhorseMP.isPlaying())
            {
                drakeMP.pause();
                drakeBtn.setText( "Play");
                feulMP.pause();
                feulBtn.setText( "Play");
                teardropMP.pause();
                teardropBtn.setText( "Play");
                hurtMP.pause();
                hurtBtn.setText( "Play");
                thunderhorseMP.pause();
                thunderhorseBtn.setText( "Play");
                aroundtheworldMP.start();
                aroundtheworldBtn.setText( "Pause");
            }
            aroundtheworldMP.start();
            aroundtheworldBtn.setText( "Pause");

        }

    }//end doAroundtheworld



}//end of MainActivity
