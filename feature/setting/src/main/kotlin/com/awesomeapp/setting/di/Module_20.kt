package com.awesomeapp.setting.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.setting.Viewmodel20_1
import com.awesomeapp.setting.Activity20_2
import com.awesomeapp.setting.Activity20_3
import com.awesomeapp.setting.Fragment20_4
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.search.Api12_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.setting.Api20_6

@Module
@InstallIn(SingletonComponent::class)
object Module_20 {
    @Provides
    @Singleton
    fun provideRepository20_5(
        api0: Api12_6 = Api12_6(),
        api1: Api8_6 = Api8_6(),
        api2: Api4_6 = Api4_6()
    ): Repository20_5 {
        return Repository20_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi20_6(): Api20_6 {
        return Api20_6()
    }
}