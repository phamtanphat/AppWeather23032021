package com.example.appweather23032021;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ImageView mImgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bước 1 : Khởi tạo Retrofit
        mImgView = findViewById(R.id.imageView);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                            .connectTimeout(10 , TimeUnit.SECONDS)
                            .readTimeout(10 , TimeUnit.SECONDS)
                            .writeTimeout(10 , TimeUnit.SECONDS)
                            .retryOnConnectionFailure(true)
                            .protocols(Arrays.asList(Protocol.HTTP_1_1))
                            .build();

        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://khoapham.vn/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ApiRequest apiRequest = retrofit.create(ApiRequest.class);

        Call<Demo1> callback = apiRequest.getDemo1();

        callback.enqueue(new Callback<Demo1>() {
            @Override
            public void onResponse(Call<Demo1> call, Response<Demo1> response) {
                Demo1 demo1 = response.body();
                Glide.with(MainActivity.this)
                        .load(demo1.getLogo())
                        .fitCenter()
                        .override(300 , 200)
                        .placeholder(R.mipmap.ic_launcher)
                        .error(android.R.drawable.stat_notify_error)
                        .into(mImgView);

            }

            @Override
            public void onFailure(Call<Demo1> call, Throwable t) {

            }
        });


    }
}