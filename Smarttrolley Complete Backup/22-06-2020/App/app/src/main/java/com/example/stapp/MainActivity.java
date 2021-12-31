package com.example.stapp;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    EditText username,password;
    Button loginbtn,signupbtn;

    String uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);

        loginbtn=(Button) findViewById(R.id.loginbtn);
        signupbtn=(Button) findViewById(R.id.signupbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname = username.getText().toString();
                pwd = password.getText().toString();

                Toast.makeText(MainActivity.this, uname+"  "+pwd, Toast.LENGTH_LONG).show();

                Login l = new Login();
                l.execute(uname, pwd);
            }
        });

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(intent);
            }
        });

    }
    class Login extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... params) {
            WebServiceCaller caller=new WebServiceCaller();
            caller.setSoapObject("login");
            caller.addProperty("uname",params[0]);
            caller.addProperty("pwd",params[1]);

            caller.callWebService();
            String res= caller.getResponse();
            return res;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            if(result.equals("false"))
            {
                // Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "Incorrect username/password", Toast.LENGTH_SHORT).show();
            }
            else
            {
                SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("uid",result);
                editor.commit();
                Intent intent=new Intent(getApplicationContext(),UserHomeActivity.class);
                startActivity(intent);
            }

            //Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
        }

    }
}
