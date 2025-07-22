package com.awesomeapp.synccontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccontact.Viewmodel64_1
import com.awesomeapp.synccontact.Activity64_2
import com.awesomeapp.synccontact.Activity64_3
import com.awesomeapp.synccontact.Fragment64_4
import com.awesomeapp.synccontact.Repository64_5
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.synccontact.Model64_8
import com.awesomeapp.synccontact.Model64_9
import com.awesomeapp.synccontact.Activity64_10
import com.awesomeapp.synccontact.Model64_12
import com.awesomeapp.synccontact.Activity64_13
import com.awesomeapp.synccontact.Model64_15
import com.awesomeapp.synccontact.Activity64_16
import com.awesomeapp.synccontact.Model64_18
import com.awesomeapp.synccontact.Activity64_19
import com.awesomeapp.synccontact.Model64_21
import com.awesomeapp.synccontact.Activity64_22
import com.awesomeapp.synccontact.Model64_24
import com.awesomeapp.synccontact.Activity64_25
import com.awesomeapp.synccontact.Model64_27
import com.awesomeapp.synccontact.Activity64_28
import com.awesomeapp.synccontact.Model64_30
import com.awesomeapp.synccontact.Activity64_31
import com.awesomeapp.synccontact.Model64_33

@Module
@InstallIn(SingletonComponent::class)
object Module_64 {
    @Provides
    @Singleton
    fun provideRepository64_5(): Repository64_5 {
        return Repository64_5()
    }

    @Provides
    @Singleton
    fun provideApi64_6(): Api64_6 {
        return Api64_6()
    }
}