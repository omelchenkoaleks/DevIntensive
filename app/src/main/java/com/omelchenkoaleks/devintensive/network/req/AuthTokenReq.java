package com.omelchenkoaleks.devintensive.network.req;

public class AuthTokenReq {
    private String auth;

    public AuthTokenReq(String auth) {
        this.auth = auth;
    }

    public String getToken() {
        return auth;
    }
}
