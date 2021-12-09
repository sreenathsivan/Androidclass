package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
 EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
 AppCompatButton b3,b4;
 String getName,getAddress,getPhone,getEmail,getUname,getPassword,getConfirmPass,getRegister,getBackToLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.address);
        ed3=(EditText) findViewById(R.id.phone_no);
        ed4=(EditText) findViewById(R.id.email);
        ed5=(EditText) findViewById(R.id.u_name);
        ed6=(EditText) findViewById(R.id.pass);
        ed7=(EditText) findViewById(R.id.cpass);
        b3=(AppCompatButton) findViewById(R.id.register);
        b4=(AppCompatButton) findViewById(R.id.backtologin);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getAddress=ed2.getText().toString();
                getPhone=ed3.getText().toString();
                getEmail=ed4.getText().toString();
                getUname=ed5.getText().toString();
                getPassword=ed6.getText().toString();
                getConfirmPass=ed7.getText().toString();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i= new Intent(getApplicationContext(),MainActivity.class);
              startActivity(i);
            }
        });
    }
}