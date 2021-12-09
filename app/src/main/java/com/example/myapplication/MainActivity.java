package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText ed1, ed2;
    AppCompatButton b1, b2;
    String getUserName, getPassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.u_name);
        ed2 = (EditText) findViewById(R.id.pass);
        b1 = (AppCompatButton) findViewById(R.id.login);
        b2 = (AppCompatButton) findViewById(R.id.gotoreg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUserName = ed1.getText().toString();
                getPassWord = ed2.getText().toString();
                Toast.makeText(getApplicationContext(), getUserName, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getPassWord, Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(i);
            }
        });

    }
}
