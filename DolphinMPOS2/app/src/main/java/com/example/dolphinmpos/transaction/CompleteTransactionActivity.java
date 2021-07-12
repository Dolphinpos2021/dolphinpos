package com.example.dolphinmpos.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dolphinmpos.DashboardActivity;
import com.example.dolphinmpos.R;

public class CompleteTransactionActivity extends AppCompatActivity {

    Button doneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 //       this.getSupportActionBar().hide();
        setContentView(R.layout.activity_complete_transaction);

        doneBtn=findViewById(R.id.doneBtn);

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}