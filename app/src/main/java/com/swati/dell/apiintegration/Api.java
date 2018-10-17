package com.swati.dell.apiintegration;

import com.swati.dell.apiintegration.getvalue.object;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    String Url="https://newsapi.org/v2/";
    @GET("top-headlines")
    Call<object> getTasks(@Query("country") String country, @Query("apiKey")String appid);
}
