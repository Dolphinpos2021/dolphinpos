package com.example.dolphinmpos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoaderActivity extends AppCompatActivity {

    //thread timing
    private final int splash_timing=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_loader);

        //thread to load the image.
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                //intent to run and move to another class.
                Intent imageIntent = new Intent(LoaderActivity.this,LoginActivity.class);
                LoaderActivity.this.startActivity(imageIntent);
                LoaderActivity.this.finish();
            }
        }, splash_timing);
    }
}