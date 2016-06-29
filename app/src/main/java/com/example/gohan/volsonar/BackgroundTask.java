package com.example.gohan.volsonar;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

// for connecting to DB
public class BackgroundTask {
    Context context;
    String server_url = "http://192.168.26.7:8080/Learn/VolSonArr/info.php";
    ArrayList<contact> arrayList = new ArrayList<contact>();
    public BackgroundTask(Context context)
    {
        this.context = context;
    }
    public ArrayList<contact> getArrayList()
    {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, server_url, (String)null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                int count = 0;
                while(count<response.length())
                {
                    try {
                        JSONObject jsonObject = response.getJSONObject(count);
                        contact c= new contact(jsonObject.getString("Name"),jsonObject.getString("Email"));
                        arrayList.add(c);
                        count++;
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context,"Error...",Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        });

        return arrayList;
    }

}

