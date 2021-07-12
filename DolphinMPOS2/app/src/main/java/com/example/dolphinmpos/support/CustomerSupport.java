package com.example.dolphinmpos.support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.dolphinmpos.R;
import com.example.dolphinmpos.support.ContactUsActivity;

public class CustomerSupport extends AppCompatActivity {


    RelativeLayout callNow,contactUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   //     this.getSupportActionBar().hide();
        setContentView(R.layout.activity_customer_support);

        callNow = findViewById(R.id.layoutCallNow);
        contactUs = findViewById(R.id.layoutContactUs);



        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), ContactUsActivity.class);
                startActivity(intent);
            }
        });


        callNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:123456789"));
                startActivity(callIntent);
            }
        });
    }
}