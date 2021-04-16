package com.myapp.flow_with_livedata_daggerhiltretrofit.dagger

import com.myapp.flow_with_livedata_daggerhiltretrofit.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(ActivityComponent::class)
class AppModule {

    @Provides
    fun provideBaseUrl(): String= "https://jsonplaceholder.typicode.com/"

    @Provides
    fun retrofitBuilder(baseUrl:String) : Retrofit=
        Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun providesApiService(retrofit: Retrofit): ApiService= retrofit.create(ApiService::class.java)
}