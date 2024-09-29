package com.example.retrofitkullanimi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeTurkey {

    @SerializedName("timezone")
    @Expose
    private  String  timezone;

    @SerializedName("utc_datetime")
    @Expose
    private String dateTime;

    @SerializedName("week_number")
    @Expose
    private int weekNum;
}
