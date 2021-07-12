package com.example.dolphinmpos.support;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dolphinmpos.R;

public class ContactUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  //      this.getSupportActionBar().hide();
        setContentView(R.layout.activity_contact_us_fragment);
    }
}