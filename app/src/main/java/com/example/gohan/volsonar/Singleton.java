package com.example.gohan.volsonar;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Freeware Sys on 29-Jun-16.
 */
public class Singleton {
    private static Singleton mInstance;
    private RequestQueue requestQueue;
    private static Context nCtx;

    private Singleton (Context context)
    {
        nCtx = context;
        requestQueue = getRequestQue();
    }
    public RequestQueue getRequestQue()
    {
        if(requestQueue==null)
        {
            requestQueue = Volley.newRequestQueue(nCtx.getApplicationContext());
        }
        return requestQueue;
    }
    public static synchronized Singleton getInstance(Context context)
    {
        if(mInstance == null)
        {
            mInstance = new Singleton(context);
        }
        return mInstance;
    }
    public <T> void addToRequestQ(Request<T> request)
    {
        requestQueue.add(request);
    }
}