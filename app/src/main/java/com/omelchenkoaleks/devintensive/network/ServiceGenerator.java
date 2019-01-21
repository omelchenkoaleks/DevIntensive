package com.omelchenkoaleks.devintensive.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

// нужен для того, чтобы создать REST сервис
public class ServiceGenerator {

    // для построения нашего httpClient
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    // создаем retrofit строитель
    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl()
}
