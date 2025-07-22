package com.awesomeapp.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.app.Viewmodel80_1
import com.awesomeapp.app.Activity80_2
import com.awesomeapp.app.Activity80_3
import com.awesomeapp.app.Fragment80_4
import com.awesomeapp.app.Repository80_5
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.app.Api80_6

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(
        api0: Api56_6 = Api56_6(),
        api1: Api60_6 = Api60_6(),
        api2: Api64_6 = Api64_6(),
        api3: Api68_6 = Api68_6(),
        api4: Api72_6 = Api72_6(),
        api5: Api76_6 = Api76_6()
    ): Repository80_5 {
        return Repository80_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}