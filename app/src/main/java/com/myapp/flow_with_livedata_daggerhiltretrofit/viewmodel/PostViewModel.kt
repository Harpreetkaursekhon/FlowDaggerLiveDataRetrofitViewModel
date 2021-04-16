package com.myapp.flow_with_livedata_daggerhiltretrofit.viewmodel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.myapp.flow_with_livedata_daggerhiltretrofit.model.Post
import com.myapp.flow_with_livedata_daggerhiltretrofit.repository.PostRepository
import kotlinx.coroutines.flow.catch

class PostViewModel @ViewModelInject constructor(private val postRepository: PostRepository): ViewModel() {

    val response: LiveData<List<Post>> = postRepository.getPost()
        .catch {
            e-> Log.d("error", "${e.message}")
        }.asLiveData()

}