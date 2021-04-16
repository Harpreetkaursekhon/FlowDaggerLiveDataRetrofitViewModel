package com.myapp.flow_with_livedata_daggerhiltretrofit.dagger

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication: Application()  {
}