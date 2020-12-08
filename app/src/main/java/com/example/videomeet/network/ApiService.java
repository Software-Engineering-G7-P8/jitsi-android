package com.example.videomeet.network;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

public abstract class ApiService {

    @POST("send")
    abstract Call<String> sendRemoteMessage(
            @HeaderMap HashMap<String, String> header,
            @Body String remoteBody
    );

}
