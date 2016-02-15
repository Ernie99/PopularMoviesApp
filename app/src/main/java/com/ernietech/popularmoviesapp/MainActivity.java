package com.ernietech.popularmoviesapp;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String movieAPiKey = BuildConfig.THE_MOVIE_DB_API_KEY;
        Toast.makeText(getApplicationContext(), "API key: " + movieAPiKey, Toast.LENGTH_SHORT).show();

    }
}
