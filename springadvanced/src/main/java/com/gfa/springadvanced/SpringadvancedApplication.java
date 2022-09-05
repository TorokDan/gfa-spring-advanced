package com.gfa.springadvanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SpringBootApplication
public class SpringadvancedApplication {

    public static final String BASE_URL = "https://api.themoviedb.org/3/movie/550'";

    public static void main(String[] args) {

        SpringApplication.run(SpringadvancedApplication.class, args);

        // not sure if this is in the good place...
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

}
