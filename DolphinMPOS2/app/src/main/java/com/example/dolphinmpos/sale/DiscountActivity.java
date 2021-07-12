package com.example.dolphinmpos.sale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.dolphinmpos.R;

public class DiscountActivity extends AppCompatActivity {

    ImageView backIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);
        intialize();
        onClickEvents();
    }

    public void intialize(){
        backIv = findViewById(R.id.imageViewDiscountBack);
    }

    public void onClickEvents(){
        backIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiscountActivity.super.onBackPressed();
            }
        });
    }
}