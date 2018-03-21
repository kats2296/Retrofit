package com.example.kats.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tanya on 21/3/18.
 */

public interface Api
{
    String BASE_URL = "http://api.wunderground.com/api/11e7201186a4d009/history_20180320/q/Punjab/";
    @GET("Amritsar.json")
    Call<Data> getData();
}
