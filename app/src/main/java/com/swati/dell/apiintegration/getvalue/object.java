package com.swati.dell.apiintegration.getvalue;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class object {


    @SerializedName("status")
    String status;

    @SerializedName("totalResults")
    String totalresult;

    @SerializedName("articles")
    List<articles> articlesList;

    public String getStatus() {
        return status;
    }

    public String getTotalresult() {
        return totalresult;
    }

    public List<articles> getArticlesList() {
        return articlesList;
    }



}
