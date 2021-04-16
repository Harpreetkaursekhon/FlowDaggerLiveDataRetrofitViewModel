package com.myapp.flow_with_livedata_daggerhiltretrofit.repository

import com.myapp.flow_with_livedata_daggerhiltretrofit.model.Post
import com.myapp.flow_with_livedata_daggerhiltretrofit.network.ApiServiceImplmnt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository
@Inject constructor(private val apiServiceImplmnt: ApiServiceImplmnt) {

    fun getPost(): Flow<List<Post>> = flow {
        val response= apiServiceImplmnt.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)

}