package com.omelchenkoaleks.devintensive.network;

import com.omelchenkoaleks.devintensive.network.req.AuthTokenReq;
import com.omelchenkoaleks.devintensive.network.res.AuthTokenRes;
import com.omelchenkoaleks.devintensive.network.res.CountryList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface RestService {

    @GET("token")
    Call<AuthTokenRes> getToken();

    @GET("token")
    Call<AuthTokenRes> getToken(@Body AuthTokenReq req);

    @GET("country")
    Call<CountryList> getCountryList();
}
