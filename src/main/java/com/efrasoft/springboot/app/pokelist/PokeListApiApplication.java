package com.efrasoft.springboot.app.pokelist;

import org.apache.camel.component.gson.GsonConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import retrofit2.Retrofit;

@SpringBootApplication
public class PokeListApiApplication {
	private static Retrofit retrofit;
	public static void main(String[] args) {
		SpringApplication.run(PokeListApiApplication.class, args);
		retrofit = new 
				Retrofit.Builder().baseUrl("https://pokeapi.co/api/v2/").addConverterFactory(GsonConverterFactory.create());
	}

}
