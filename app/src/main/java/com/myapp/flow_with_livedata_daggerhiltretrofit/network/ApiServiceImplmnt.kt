package com.myapp.flow_with_livedata_daggerhiltretrofit.network

import com.myapp.flow_with_livedata_daggerhiltretrofit.model.Post
import javax.inject.Inject

class ApiServiceImplmnt @Inject constructor(private val apiService: ApiService) {

 suspend fun getPost(): List<Post> = apiService.getPost()
}