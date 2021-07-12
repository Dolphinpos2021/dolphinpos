package com.example.dolphinmpos.sale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.dolphinmpos.R;
import com.example.dolphinmpos.transaction.CompleteTransactionActivity;

public class CashActivity extends AppCompatActivity {

    Button submitBtn;
    Intent intent;
    ImageView backIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  //      this.getSupportActionBar().hide();
        setContentView(R.layout.activity_cash);

        submitBtn=findViewById(R.id.submitBtn);
        backIv = findViewById(R.id.imageViewCashBack);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), CompleteTransactionActivity.class);
                startActivity(intent);
            }
        });

        backIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              CashActivity.super.onBackPressed();
            }
        });

    }
}