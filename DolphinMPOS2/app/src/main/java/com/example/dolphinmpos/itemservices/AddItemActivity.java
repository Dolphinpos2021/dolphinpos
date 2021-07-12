package com.example.dolphinmpos.itemservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dolphinmpos.DashboardActivity;
import com.example.dolphinmpos.R;

public class AddItemActivity extends AppCompatActivity {

    Button saveBtn;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  //      this.getSupportActionBar().hide();
        setContentView(R.layout.activity_add_item);

        saveBtn=findViewById(R.id.saveBtn);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}