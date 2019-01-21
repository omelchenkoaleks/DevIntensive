package com.omelchenkoaleks.devintensive.network.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthTokenRes {
    @SerializedName("auth")
    @Expose
    public String auth;

    public String getToken() {
        return auth;
    }
}
