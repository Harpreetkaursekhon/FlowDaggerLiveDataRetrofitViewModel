package com.myapp.flow_with_livedata_daggerhiltretrofit.network

import com.myapp.flow_with_livedata_daggerhiltretrofit.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPost():List<Post>
}