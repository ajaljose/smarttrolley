package com.example.stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    EditText name,email,password;
    Button sbtn;
    String uname,emal,pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name=(EditText) findViewById(R.id.sname);
        email=(EditText) findViewById(R.id.semail);
        password=(EditText) findViewById(R.id.spassword);
        sbtn=(Button) findViewById(R.id.sbtn);
        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname = name.getText().toString();
                emal=email.getText().toString();
                pwd = password.getText().toString();

                Toast.makeText(getApplicationContext(), uname+"  "+pwd, Toast.LENGTH_LONG).show();
                Signup s = new Signup();
                s.execute(uname,emal,pwd,emal);

            }
        });


    }

    class Signup extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... params) {
            WebServiceCaller caller=new WebServiceCaller();
            caller.setSoapObject("signup");
            caller.addProperty("name",params[0]);
            caller.addProperty("uname",params[1]);
            caller.addProperty("pwd",params[2]);
            caller.addProperty("email",params[3]);


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
                Toast.makeText(getApplicationContext(), "Server not responding", Toast.LENGTH_SHORT).show();
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
