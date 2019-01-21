package com.omelchenkoaleks.devintensive.data;

import android.content.Context;
import android.util.Log;

import com.omelchenkoaleks.devintensive.network.RestService;
import com.omelchenkoaleks.devintensive.network.ServiceGenerator;
import com.omelchenkoaleks.devintensive.network.req.AuthTokenReq;
import com.omelchenkoaleks.devintensive.network.res.AuthTokenRes;

import retrofit2.Call;

public class DataManager {
    private static DataManager INSTANCE = null;

    private RestService restService;

    public DataManager() {
        this.restService = ServiceGenerator.createService(RestService.class);
    }

    public static DataManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public Call<AuthTokenRes> getToken(AuthTokenReq authTokenReq) {
        Log.d("resp", "resfdfsf");
        return restService.getToken(authTokenReq);
    }

    public Call<AuthTokenRes> getToken() {
        return restService.getToken();
    }
}
