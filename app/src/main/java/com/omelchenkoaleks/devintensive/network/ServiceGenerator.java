package com.omelchenkoaleks.devintensive.network;

import com.omelchenkoaleks.devintensive.utils.AppConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// нужен для того, чтобы создать REST сервис
public class ServiceGenerator {

    // для построения нашего httpClient
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    // создаем retrofit строитель
    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl(AppConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    // метод, который будет создавать наш сервис
    public static <S> S createService(Class<S> serviceClass) {
        // подключаем логирование
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        Retrofit retrofit = retrofitBuilder
                .client(httpClient.build())
                .build();
        // указываем тот класс, который будет реализовывать наши методы
        return retrofit.create(serviceClass);
    }
}
