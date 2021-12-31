package com.example.stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class UserHomeActivity extends AppCompatActivity {
    ImageButton vpbtn,ubtn,cpbtn,bt_scanqr,vcart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        ubtn=(ImageButton) findViewById(R.id.imgeditprofile);
        cpbtn=(ImageButton) findViewById(R.id.changepassword);
        vcart=(ImageButton) findViewById(R.id.vcart);
        bt_scanqr=(ImageButton) findViewById(R.id.imgbt_scanqr);
        vpbtn=(ImageButton) findViewById(R.id.imgmyprofile) ;

        SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
        String uid=sharedPreferences.getString("uid","");
        Toast.makeText(getApplicationContext(),uid,Toast.LENGTH_LONG).show();
        vpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ViewProfileActivity.class);
                startActivity(intent);
            }
        });
        ubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),EditProfileActivity.class);
                startActivity(intent);
            }
        });

        cpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ChangePasswordActivity.class);
                startActivity(intent);
            }
        });

        bt_scanqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"scan clicked",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getApplicationContext(),ScannerActivity.class);
                startActivity(intent);
            }
        });

        vcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MyCartActivity.class);
                startActivity(intent);
            }
        });
    }

}
