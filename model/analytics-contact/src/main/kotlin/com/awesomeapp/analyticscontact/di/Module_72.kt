package com.awesomeapp.analyticscontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscontact.Viewmodel72_1
import com.awesomeapp.analyticscontact.Activity72_2
import com.awesomeapp.analyticscontact.Activity72_3
import com.awesomeapp.analyticscontact.Fragment72_4
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.video.Api44_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.analyticscontact.Api72_6

@Module
@InstallIn(SingletonComponent::class)
object Module_72 {
    @Provides
    @Singleton
    fun provideRepository72_5(
        api0: Api44_6 = Api44_6(),
        api1: Api48_6 = Api48_6(),
        api2: Api52_6 = Api52_6()
    ): Repository72_5 {
        return Repository72_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi72_6(): Api72_6 {
        return Api72_6()
    }
}