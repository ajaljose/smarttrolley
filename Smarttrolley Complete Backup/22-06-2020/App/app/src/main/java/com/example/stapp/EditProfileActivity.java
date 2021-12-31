package com.example.stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class EditProfileActivity extends AppCompatActivity {
EditText epname,epaddress,epemail,epnumber,epgender,epusername,epplaceid;
String ename,eaddress,eemail,enumber,egender,eusername,eplaceid;
Button ubtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        epname=(EditText) findViewById(R.id.epname);
        epaddress=(EditText) findViewById(R.id.epaddress);
        epemail=(EditText) findViewById(R.id.epemail);
        epnumber=(EditText) findViewById(R.id.epnumber);
        epgender=(EditText) findViewById(R.id.epgender);
        //epusername=(EditText) findViewById(R.id.epusername);
        epplaceid=(EditText) findViewById(R.id.epplaceid);
        ubtn=(Button) findViewById(R.id.updatebtn);
        SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
        final String uid=sharedPreferences.getString("uid","");

        Viewprofile vobj=new Viewprofile();
        vobj.execute(uid);

        ubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        ename = epname.getText().toString();
                        eaddress = epaddress.getText().toString();
                        eemail=epemail.getText().toString();
                        enumber=epnumber.getText().toString();
                        egender=epgender.getText().toString();
                        //eusername=epusername.getText().toString();
                        eplaceid=epplaceid.getText().toString();
                        //Toast.makeText(getApplicationContext(), uname+"  "+pwd, Toast.LENGTH_LONG).show();
                        EditProfileActivity.Editprofile e = new EditProfileActivity.Editprofile();
                        e.execute(uid,ename,eaddress,eemail,enumber,egender,eplaceid);


            }
        });

    }

    class Editprofile extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... params) {
            WebServiceCaller caller=new WebServiceCaller();
            caller.setSoapObject("editprofile");
            caller.addProperty("id",params[0]);
            caller.addProperty("name",params[1]);
            caller.addProperty("address",params[2]);
            caller.addProperty("email",params[3]);
            caller.addProperty("contactno",params[4]);
            caller.addProperty("gender",params[5]);
            //caller.addProperty("username",params[6]);
            caller.addProperty("place",params[6]);


            caller.callWebService();
            String res= caller.getResponse();
            return res;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if(result.equals(true)){
                Toast.makeText(getApplicationContext(), "Profile Update Successful", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),UserHomeActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(getApplicationContext(), "Profile Update FAILED", Toast.LENGTH_SHORT).show();
            }


            SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
            String id=sharedPreferences.getString("uid",result);
            //Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
        }

    }

    class Viewprofile extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... params) {
            WebServiceCaller caller=new WebServiceCaller();
            caller.setSoapObject("getprofile");
            caller.addProperty("uid",params[0]);



            caller.callWebService();
            String res= caller.getResponse();
            return res;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            try {
                JSONObject jobj = new JSONObject(result);

                epname.setText(jobj.getString("name"));
                epaddress.setText(jobj.getString("address"));
                epemail.setText(jobj.getString("email"));
                epnumber.setText(jobj.getString("contactno"));
                epgender.setText(jobj.getString("gender"));
                epplaceid.setText(jobj.getString("placename"));



                //SharedPreferences sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
                //String id=sharedPreferences.getString("uid",result);
                //Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }catch (JSONException ex){
                Log.e("json",ex.toString());
            }
        }

    }

}
