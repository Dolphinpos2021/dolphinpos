package com.example.dolphinmpos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.dolphinmpos.customerloyalty.CustomerLoyaltyActivity;
import com.example.dolphinmpos.itemservices.ItemServicesActivity;
import com.example.dolphinmpos.sale.SaleActivity;
import com.example.dolphinmpos.support.CustomerSupport;

public class DashboardActivity extends AppCompatActivity {

    Intent intent;
    ImageView saleImg,itemServicesImg,supportImg,customerLoyaltyImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   this.getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard);

        saleImg=findViewById(R.id.saleImage);
        itemServicesImg=findViewById(R.id.itemServicesImg);
        supportImg = findViewById(R.id.supportImg);
        customerLoyaltyImg=findViewById(R.id.customerLoyaltyImg);

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

        supportImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), CustomerSupport.class);
                startActivity(intent);
            }
        });

        customerLoyaltyImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), CustomerLoyaltyActivity.class);
                startActivity(intent);
            }
        });
    }
}