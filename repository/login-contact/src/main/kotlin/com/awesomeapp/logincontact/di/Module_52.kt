package com.awesomeapp.logincontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logincontact.Viewmodel52_1
import com.awesomeapp.logincontact.Activity52_2
import com.awesomeapp.logincontact.Activity52_3
import com.awesomeapp.logincontact.Fragment52_4
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.logincontact.Model52_8
import com.awesomeapp.logincontact.Model52_9
import com.awesomeapp.logincontact.Activity52_10
import com.awesomeapp.logincontact.Model52_12
import com.awesomeapp.logincontact.Activity52_13

@Module
@InstallIn(SingletonComponent::class)
object Module_52 {
    @Provides
    @Singleton
    fun provideRepository52_5(
        api0: Api40_6 = Api40_6()
    ): Repository52_5 {
        return Repository52_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi52_6(): Api52_6 {
        return Api52_6()
    }
}