package com.example.dngy.youtubeapp_vsite;

import android.content.Intent;
import android.content.UriPermission;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener
{

    private String GOOGLE_API_KEY = "AIzaSyAfpEFPtukVeFcry4cABJkRvP_jV4EdhQE";
    private String PMA = "PLF875D917B4F481D0"; //playlista predavanja
    private String OOP = "PLD4E22CFA243EF1E9";
    private String CSH = "PL87D1AA97C4896DE8";
    private String UPROG = "PLqewhEL-OMhFeG_w8UDDi20dS2tMvZ1_9";
    private String NWP = "PLCD83BE89BB756F1D";
    private String AODR = "PLqewhEL-OMhF_Li9bTXMSgN4oUYdZ5yFn";
    private String OOM = "PLD258917341F03D0C";
    private String PET = "PL51410D1720402816";
    private String DOD = "PLqewhEL-OMhHJrUIpETbVhQT7edxnWCS8";


    private Button btnPMA;
    private Button btnOOP;
    private Button btnCSH;
    private Button btnUPROG;
    private Button btnNWP;
    private Button btnAODR;
    private Button btnOOM;
    private Button btnPET;
    private Button btnDOD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPMA = (Button) findViewById(R.id.btnPMA);
        btnOOP = (Button) findViewById(R.id.btnOOP);
        btnCSH = (Button) findViewById(R.id.btnCSH);
        btnUPROG = (Button) findViewById(R.id.btnUPROG);
        btnNWP = (Button) findViewById(R.id.btnNWP);
        btnAODR = (Button) findViewById(R.id.btnAODR);
        btnOOM = (Button) findViewById(R.id.btnOOM);
        btnPET = (Button) findViewById(R.id.btnPET);
        btnDOD = (Button) findViewById(R.id.btnDOD);

        btnPMA.setOnClickListener(this); //this poziva donju metodu onClick
        btnOOP.setOnClickListener(this);
        btnCSH.setOnClickListener(this);
        btnUPROG.setOnClickListener(this);
        btnNWP.setOnClickListener(this);
        btnAODR.setOnClickListener(this);
        btnOOM.setOnClickListener(this);
        btnPET.setOnClickListener(this);
        btnDOD.setOnClickListener(this);

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
            case R.id.btnPMA:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, PMA);
                break;

            case R.id.btnOOP:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, OOP);
                break;

            case R.id.btnCSH:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, CSH);
                break;

            case R.id.btnUPROG:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, UPROG);
                break;

            case R.id.btnNWP:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, NWP);
                break;

            case R.id.btnAODR:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, AODR);
                break;

            case R.id.btnOOM:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, OOM);
                break;

            case R.id.btnPET:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, PET);
                break;

            case R.id.btnDOD:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, DOD);
                break;

            default:

        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
