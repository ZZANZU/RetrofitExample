package com.tistory.dayglo.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import static com.tistory.dayglo.retrofitexample.MainActivity.createOkHttpClient;

/**
 * Created by user on 2017-08-06.
 */

public interface MysqlService {
    @GET("student")
    Call<List<Student>> repoStudent();
//            @Path("id") int id);
//            @Path("repo") String repo);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://13.59.174.162:7579/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(createOkHttpClient())
            .build();
}



