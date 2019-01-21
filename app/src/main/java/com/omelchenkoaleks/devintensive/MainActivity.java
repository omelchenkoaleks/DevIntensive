package com.omelchenkoaleks.devintensive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.omelchenkoaleks.devintensive.data.DataManager;
import com.omelchenkoaleks.devintensive.network.req.AuthTokenReq;
import com.omelchenkoaleks.devintensive.network.res.AuthTokenRes;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private DataManager dataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataManager = DataManager.getInstance();

        Call<AuthTokenRes> call = dataManager.getToken(new AuthTokenReq("auth"));
        ((retrofit2.Call) call).enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                
            }

            @Override
            public void onFailure(Call call, Throwable t) {

            }
        });
    }

}
