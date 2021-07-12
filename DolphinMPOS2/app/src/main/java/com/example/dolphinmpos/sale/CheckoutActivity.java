package com.example.dolphinmpos.sale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.dolphinmpos.R;

public class CheckoutActivity extends AppCompatActivity {

    Button cardBtn,cashBtn,discountBtn,surchageBtn;
    Intent intent;
    ImageView backIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   //     this.getSupportActionBar().hide();
        setContentView(R.layout.activity_checkout);

        intialize();
        onClickEvents();


    }

    public void intialize(){
        cardBtn=findViewById(R.id.cardBtn);
        cashBtn=findViewById(R.id.cashBtn);
        discountBtn=findViewById(R.id.discountBtn);
        backIv = findViewById(R.id.imageViewCheckoutBack);
        surchageBtn = findViewById(R.id.surcharge_Btn);
    }

    public void onClickEvents(){

        backIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               CheckoutActivity.super.onBackPressed();
            }
        });

        cardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), CardActivity.class);
                startActivity(intent);
            }
        });

        cashBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), CashActivity.class);
                startActivity(intent);
            }
        });

        surchageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), SurchargeActivity.class);
                startActivity(intent);
            }
        });
        discountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), DiscountActivity.class);
                startActivity(intent);
            }
        });
    }
}