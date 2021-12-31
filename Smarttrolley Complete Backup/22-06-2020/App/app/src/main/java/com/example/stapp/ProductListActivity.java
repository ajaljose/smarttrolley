package com.example.stapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

public class ProductListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        SharedPreferences sharedPreferences=getSharedPreferences("maxvalue",MODE_PRIVATE);
        String mxv=sharedPreferences.getString("mxv","");
       Toast.makeText(getApplicationContext(),mxv,Toast.LENGTH_LONG).show();
        Productlist l= new Productlist();
        l.execute();
    }
    class Productlist extends AsyncTask<String,String,String>{

        @Override
        protected String doInBackground(String... params) {
            WebServiceCaller caller=new WebServiceCaller();
            caller.setSoapObject("productlist");

            caller.callWebService();
            String res= caller.getResponse();
            return res;
        }
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            //Toast.makeText(ProductListActivity.this,result,Toast.LENGTH_LONG).show();
            try {
                JSONArray jarr = new JSONArray(result);

                ProductListData[] ListData = null;
                for(int i=0;i<jarr.length();i++)
                {
                    JSONObject job=jarr.getJSONObject(i);
                    ListData[i]=new ProductListData("",job.getString("productname"), job.getString("brand"), "Rs:"+ job.getString("price")+"/-",job.getString("block"),job.getString("rack"));
                }

                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclermycart);
                ProductListAdapter adapter = new ProductListAdapter(ListData);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(ProductListActivity.this));
                recyclerView.setAdapter(adapter);
            }catch (Exception ex){}
        }
    }
}
