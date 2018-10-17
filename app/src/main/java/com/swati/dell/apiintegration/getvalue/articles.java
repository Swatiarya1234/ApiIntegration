package com.swati.dell.apiintegration.getvalue;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class articles {

    @SerializedName("source")
    @Expose
    source source;

    public source getSource() {
        return source;
    }

}
