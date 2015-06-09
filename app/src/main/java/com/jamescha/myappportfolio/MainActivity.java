package com.jamescha.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsSetup();
    }

    private void buttonsSetup() {
        Button spotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        spotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.spotify_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button scoresAppButton = (Button) findViewById(R.id.scoresAppButton);
        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.scores_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button libraryAppButton = (Button) findViewById(R.id.libraryAppButton);
        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.library_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.build_it_bigger_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button xyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.xyz_reader_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button capstoneButton = (Button) findViewById(R.id.capstoneMyOwnAppButton);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.capstone_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
