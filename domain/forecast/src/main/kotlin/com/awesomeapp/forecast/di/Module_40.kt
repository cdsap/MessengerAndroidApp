package com.awesomeapp.forecast.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecast.Viewmodel40_1
import com.awesomeapp.forecast.Activity40_2
import com.awesomeapp.forecast.Activity40_3
import com.awesomeapp.forecast.Fragment40_4
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.forecast.Service40_7
import com.awesomeapp.forecast.Worker40_8
import com.awesomeapp.forecast.Model40_10
import com.awesomeapp.forecast.Model40_11
import com.awesomeapp.forecast.Activity40_12
import com.awesomeapp.forecast.Model40_14
import com.awesomeapp.forecast.Activity40_15
import com.awesomeapp.forecast.Model40_17
import com.awesomeapp.forecast.Activity40_18
import com.awesomeapp.forecast.Model40_20
import com.awesomeapp.forecast.Activity40_21
import com.awesomeapp.forecast.Model40_23
import com.awesomeapp.forecast.Activity40_24
import com.awesomeapp.forecast.Model40_26
import com.awesomeapp.forecast.Activity40_27
import com.awesomeapp.forecast.Model40_29
import com.awesomeapp.forecast.Activity40_30
import com.awesomeapp.forecast.Model40_32
import com.awesomeapp.forecast.Activity40_33
import com.awesomeapp.forecast.Model40_35
import com.awesomeapp.forecast.Activity40_36
import com.awesomeapp.forecast.Model40_38
import com.awesomeapp.forecast.Activity40_39
import com.awesomeapp.forecast.Model40_41
import com.awesomeapp.forecast.Activity40_42
import com.awesomeapp.forecast.Model40_44
import com.awesomeapp.forecast.Activity40_45
import com.awesomeapp.forecast.Model40_47
import com.awesomeapp.forecast.Activity40_48
import com.awesomeapp.forecast.Model40_50
import com.awesomeapp.forecast.Activity40_51
import com.awesomeapp.forecast.Model40_53
import com.awesomeapp.forecast.Activity40_54
import com.awesomeapp.forecast.Model40_56
import com.awesomeapp.forecast.Activity40_57
import com.awesomeapp.forecast.Model40_59
import com.awesomeapp.forecast.Activity40_60
import com.awesomeapp.forecast.Model40_62
import com.awesomeapp.forecast.Activity40_63
import com.awesomeapp.forecast.Model40_65
import com.awesomeapp.forecast.Activity40_66
import com.awesomeapp.forecast.Model40_68
import com.awesomeapp.forecast.Activity40_69
import com.awesomeapp.forecast.Model40_71
import com.awesomeapp.forecast.Activity40_72
import com.awesomeapp.forecast.Model40_74
import com.awesomeapp.forecast.Activity40_75
import com.awesomeapp.forecast.Model40_77
import com.awesomeapp.forecast.Activity40_78

@Module
@InstallIn(SingletonComponent::class)
object Module_40 {
    @Provides
    @Singleton
    fun provideRepository40_5(
        api0: Api36_6 = Api36_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api28_6 = Api28_6(),
        api3: Api24_6 = Api24_6(),
        api4: Api32_6 = Api32_6(),
        api5: Api16_6 = Api16_6()
    ): Repository40_5 {
        return Repository40_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi40_6(): Api40_6 {
        return Api40_6()
    }
}