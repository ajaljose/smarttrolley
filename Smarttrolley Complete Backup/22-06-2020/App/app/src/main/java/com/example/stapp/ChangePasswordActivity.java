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

public class ChangePasswordActivity extends AppCompatActivity {
    EditText npassword,cnpassword;
    String npass,cnpass;
    Button cpbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        npassword=(EditText) findViewById(R.id.npassword);
        cnpassword=(EditText) findViewById(R.id.cnpassword);
        cpbtn=(Button)findViewById(R.id.cpbtn);
        SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
        final String uid=sharedPreferences.getString("uid","");

        cpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(npassword.getText().toString().equals(cnpassword.getText().toString())) {
                    npass = npassword.getText().toString();
                    ChangePasswordActivity.Changepassword s = new ChangePasswordActivity.Changepassword();
                    s.execute(uid, npass);
                }
                else{
                    Toast.makeText(getApplicationContext(), "please confirm your password!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    class Changepassword extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... params) {
            WebServiceCaller caller = new WebServiceCaller();
            caller.setSoapObject("changepassword");
            caller.addProperty("id", params[0]);
            caller.addProperty("pwd", params[1]);

            caller.callWebService();
            String res = caller.getResponse();
            return res;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            if(result.equals("false"))
            {
                // Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Incorrect Password", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(), "changed", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),UserHomeActivity.class);
                startActivity(intent);
            }

            //Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
        }

    }

}
