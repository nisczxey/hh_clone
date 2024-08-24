package com.example.data.remote.service

import com.example.data.remote.api.TzApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TzNetworkService {

    private fun getConfiguredRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit
    }

    val api : TzApi = getConfiguredRetrofit().create(TzApi::class.java)

    companion object {
         private const val BASE_URL = "BASE_URL"
    }
}