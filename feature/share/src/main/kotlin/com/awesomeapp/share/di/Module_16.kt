package com.awesomeapp.share.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.share.Viewmodel16_1
import com.awesomeapp.share.Activity16_2
import com.awesomeapp.share.Activity16_3
import com.awesomeapp.share.Fragment16_4
import com.awesomeapp.share.Repository16_5
import com.awesomeapp.search.Api12_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.share.Api16_6

@Module
@InstallIn(SingletonComponent::class)
object Module_16 {
    @Provides
    @Singleton
    fun provideRepository16_5(
        api0: Api12_6 = Api12_6(),
        api1: Api8_6 = Api8_6()
    ): Repository16_5 {
        return Repository16_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi16_6(): Api16_6 {
        return Api16_6()
    }
}