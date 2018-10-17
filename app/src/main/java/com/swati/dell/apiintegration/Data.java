package com.swati.dell.apiintegration;


import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Data {
    MainActivity context;
    public Data(MainActivity context) {
        this.context=context;
    }
    public void findnews(String code){
        code=code.toLowerCase();
        String url2 = "https://newsapi.org/v2/top-headlines?country="+ code + "&apiKey=c6a5d884e6a84324a95ea95a49467d00";
        final JsonObjectRequest jor1=new JsonObjectRequest(Request.Method.GET, url2, null, new Response.Listener<JSONObject>() {
            @Override public void onResponse(JSONObject response) {
                try {

                    JSONArray array=response.getJSONArray("articles");


                        JSONObject object = array.getJSONObject(0);
                        String headlines = object.getString("title");
                        String author=object.getString("author");
                        String description = object.getString("description");
                        String url = object.getString("url");
                        context.setvalues(author,headlines,description,url);




                }catch (JSONException e)
                {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override public void onErrorResponse(VolleyError error) {

            }
        }
        );

        RequestQueue queue1= Volley.newRequestQueue(context);
        queue1.add(jor1);


    }
    }




