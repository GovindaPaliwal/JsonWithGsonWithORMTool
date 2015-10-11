/**
 * Author: GP
 * URL:
 * twitter:
 * */
package com.gp.livedemo;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.gp.controller.DatabaseHandler;
import com.orm.SugarContext;

import android.app.Application;
import android.text.TextUtils;

public class AppController extends Application
{
	public static final String TAG = AppController.class
            .getSimpleName();
 
    private RequestQueue mRequestQueue;
  
    public static DatabaseHandler db;
    private static AppController mInstance;
 
    public static Gson gson = new Gson();
    
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
      //  db=new DatabaseHandler(mInstance);
        /**
         * Suger ORM init
         */
        SugarContext.init(this);
    }
 
    public static synchronized AppController getInstance() {
        return mInstance;
    }
 
    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
 
        return mRequestQueue;
    }
 
 
    public <T> void addToRequestQueue(Request<T> req, String tag) {
        // set the default tag if tag is empty
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }
 
    public <T> void addToRequestQueue(Request<T> req) {
        req.setTag(TAG);
        getRequestQueue().add(req);
    }
 
    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }
    
    @Override
    public void onTerminate() {
        super.onTerminate();
        SugarContext.terminate();
    }
}

