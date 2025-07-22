package com.awesomeapp.usercontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.usercontact.Viewmodel56_1
import com.awesomeapp.usercontact.Activity56_2
import com.awesomeapp.usercontact.Activity56_3
import com.awesomeapp.usercontact.Fragment56_4
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.usercontact.Model56_8
import com.awesomeapp.usercontact.Model56_9
import com.awesomeapp.usercontact.Activity56_10
import com.awesomeapp.usercontact.Model56_12
import com.awesomeapp.usercontact.Activity56_13
import com.awesomeapp.usercontact.Model56_15
import com.awesomeapp.usercontact.Activity56_16
import com.awesomeapp.usercontact.Model56_18
import com.awesomeapp.usercontact.Activity56_19
import com.awesomeapp.usercontact.Model56_21
import com.awesomeapp.usercontact.Activity56_22
import com.awesomeapp.usercontact.Model56_24
import com.awesomeapp.usercontact.Activity56_25
import com.awesomeapp.usercontact.Model56_27
import com.awesomeapp.usercontact.Activity56_28
import com.awesomeapp.usercontact.Model56_30
import com.awesomeapp.usercontact.Activity56_31
import com.awesomeapp.usercontact.Model56_33
import com.awesomeapp.usercontact.Activity56_34
import com.awesomeapp.usercontact.Model56_36
import com.awesomeapp.usercontact.Activity56_37
import com.awesomeapp.usercontact.Model56_39
import com.awesomeapp.usercontact.Activity56_40
import com.awesomeapp.usercontact.Model56_42
import com.awesomeapp.usercontact.Activity56_43
import com.awesomeapp.usercontact.Model56_45
import com.awesomeapp.usercontact.Activity56_46
import com.awesomeapp.usercontact.Model56_48
import com.awesomeapp.usercontact.Activity56_49
import com.awesomeapp.usercontact.Model56_51
import com.awesomeapp.usercontact.Activity56_52
import com.awesomeapp.usercontact.Model56_54
import com.awesomeapp.usercontact.Activity56_55

@Module
@InstallIn(SingletonComponent::class)
object Module_56 {
    @Provides
    @Singleton
    fun provideRepository56_5(
        api0: Api40_6 = Api40_6()
    ): Repository56_5 {
        return Repository56_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi56_6(): Api56_6 {
        return Api56_6()
    }
}