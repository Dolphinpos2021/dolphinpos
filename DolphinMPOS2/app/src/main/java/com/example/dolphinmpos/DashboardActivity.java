package com.example.dolphinmpos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {

    Intent intent;
    ImageView saleImg,itemServicesImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard);

        saleImg=findViewById(R.id.saleImage);
        itemServicesImg=findViewById(R.id.itemServicesImg);

        saleImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), SaleActivity.class);
                startActivity(intent);
            }
        });

        itemServicesImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), ItemServicesActivity.class);
                startActivity(intent);
            }
        });
    }
}