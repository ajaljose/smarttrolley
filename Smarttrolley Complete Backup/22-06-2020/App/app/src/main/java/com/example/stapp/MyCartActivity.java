package com.example.stapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

public class MyCartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);


        CartList l = new CartList();
        l.execute("35");


    }

    class CartList extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... params) {
            WebServiceCaller caller=new WebServiceCaller();
            caller.setSoapObject("cartlist");
            caller.addProperty("product_id",params[0]);

            caller.callWebService();
            String res= caller.getResponse();
            return res;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            Toast.makeText(MyCartActivity.this,result,Toast.LENGTH_LONG).show();
            try {
                JSONArray jarr = new JSONArray(result);

                MyCartListData[] myListData = null;
                for(int i=0;i<jarr.length();i++)
                {
                    JSONObject job=jarr.getJSONObject(i);
                    myListData[i]=new MyCartListData("", job.getString("productname"), job.getString("brand"), "Rs:"+ job.getString("price")+"/-");
                }

                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclermycart);
                MyCartListAdapter adapter = new MyCartListAdapter(myListData);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(MyCartActivity.this));
                recyclerView.setAdapter(adapter);
            }catch (Exception ex){}
        }

    }

}
