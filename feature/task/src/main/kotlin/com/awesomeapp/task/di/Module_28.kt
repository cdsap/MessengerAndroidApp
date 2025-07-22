package com.awesomeapp.task.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.task.Viewmodel28_1
import com.awesomeapp.task.Activity28_2
import com.awesomeapp.task.Activity28_3
import com.awesomeapp.task.Fragment28_4
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.task.Model28_8
import com.awesomeapp.task.Model28_9
import com.awesomeapp.task.Activity28_10
import com.awesomeapp.task.Model28_12
import com.awesomeapp.task.Activity28_13
import com.awesomeapp.task.Model28_15
import com.awesomeapp.task.Activity28_16
import com.awesomeapp.task.Model28_18
import com.awesomeapp.task.Activity28_19
import com.awesomeapp.task.Model28_21
import com.awesomeapp.task.Activity28_22
import com.awesomeapp.task.Model28_24
import com.awesomeapp.task.Activity28_25
import com.awesomeapp.task.Model28_27
import com.awesomeapp.task.Activity28_28
import com.awesomeapp.task.Model28_30
import com.awesomeapp.task.Activity28_31
import com.awesomeapp.task.Model28_33
import com.awesomeapp.task.Activity28_34
import com.awesomeapp.task.Model28_36
import com.awesomeapp.task.Activity28_37
import com.awesomeapp.task.Model28_39
import com.awesomeapp.task.Activity28_40
import com.awesomeapp.task.Model28_42
import com.awesomeapp.task.Activity28_43
import com.awesomeapp.task.Model28_45
import com.awesomeapp.task.Activity28_46
import com.awesomeapp.task.Model28_48
import com.awesomeapp.task.Activity28_49
import com.awesomeapp.task.Model28_51
import com.awesomeapp.task.Activity28_52
import com.awesomeapp.task.Model28_54
import com.awesomeapp.task.Activity28_55
import com.awesomeapp.task.Model28_57
import com.awesomeapp.task.Activity28_58
import com.awesomeapp.task.Model28_60
import com.awesomeapp.task.Activity28_61
import com.awesomeapp.task.Model28_63
import com.awesomeapp.task.Activity28_64
import com.awesomeapp.task.Model28_66
import com.awesomeapp.task.Activity28_67
import com.awesomeapp.task.Model28_69
import com.awesomeapp.task.Activity28_70

@Module
@InstallIn(SingletonComponent::class)
object Module_28 {
    @Provides
    @Singleton
    fun provideRepository28_5(
        api0: Api4_6 = Api4_6(),
        api1: Api8_6 = Api8_6()
    ): Repository28_5 {
        return Repository28_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi28_6(): Api28_6 {
        return Api28_6()
    }
}