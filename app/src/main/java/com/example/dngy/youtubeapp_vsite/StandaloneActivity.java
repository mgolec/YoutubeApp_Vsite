package com.example.dngy.youtubeapp_vsite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener
{

    private String GOOGLE_API_KEY = "AIzaSyAfpEFPtukVeFcry4cABJkRvP_jV4EdhQE";
    private String YOUTUBE_VIDEO_ID = "_hcXb7UafYg";
    private String YOUTUVE_PLAYLIST = "TBA";
    private Button btnPlayVideo;
    private Button btnPlayPlaylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        btnPlayPlaylist = (Button) findViewById(R.id.btnPlayPlaylist);

        btnPlayVideo.setOnClickListener(this); //this poziva donju metodu onClick
        btnPlayPlaylist.setOnClickListener(this);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        //switch odabire koji je button stisnut
        switch (v.getId()){
            case R.id.btnPlayVideo:
                break;

            case R.id.btnPlayPlaylist:
                break;

            default:

        }

    }
}
