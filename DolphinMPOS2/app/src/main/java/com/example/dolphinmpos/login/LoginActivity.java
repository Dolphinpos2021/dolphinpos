package com.example.dolphinmpos.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.dolphinmpos.DashboardActivity;
import com.example.dolphinmpos.R;

public class LoginActivity extends AppCompatActivity {

    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn=findViewById(R.id.loginBtn);

        //action listener of button
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}