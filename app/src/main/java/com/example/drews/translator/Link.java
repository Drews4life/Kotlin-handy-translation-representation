package com.example.drews.translator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;



public interface Link {
     String URL = "https://translate.google.com";
     Gson gson = new GsonBuilder().create();

    @FormUrlEncoded
    @POST("user/edit")
    Call<Object> translate(@FieldMap Map<String,String> map);
    class Consequences {

        public static GithubApiService create() {
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl(URL)
                    .build();

            return retrofit.create(com.example.drews.translator.Consequences.GithubApiService.class);
        }
    }
}
