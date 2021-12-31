package com.example.stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetMaxValueActivity extends AppCompatActivity {
    EditText setvalue;
    Button sbtn,skipbtn;
    String mvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_max_value);
        setvalue=(EditText) findViewById(R.id.setvalue);
        sbtn=(Button) findViewById(R.id.sbtn);
        skipbtn=(Button) findViewById(R.id.skipbtn);
        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalue=setvalue.getText().toString();
                SharedPreferences sharedPreferences=getSharedPreferences("maxvalue",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("mxv",mvalue);
                editor.commit();
                Intent intent=new Intent(getApplicationContext(),ProductListActivity.class);
                startActivity(intent);

            }
        });
        skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ProductListActivity.class);
                startActivity(intent);
            }
        });
    }

}
