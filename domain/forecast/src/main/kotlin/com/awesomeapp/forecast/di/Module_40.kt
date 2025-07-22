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
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.setting.Api20_6
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
import com.awesomeapp.forecast.Model40_80
import com.awesomeapp.forecast.Activity40_81
import com.awesomeapp.forecast.Model40_83
import com.awesomeapp.forecast.Activity40_84
import com.awesomeapp.forecast.Model40_86
import com.awesomeapp.forecast.Activity40_87
import com.awesomeapp.forecast.Model40_89
import com.awesomeapp.forecast.Activity40_90
import com.awesomeapp.forecast.Model40_92
import com.awesomeapp.forecast.Activity40_93
import com.awesomeapp.forecast.Model40_95
import com.awesomeapp.forecast.Activity40_96
import com.awesomeapp.forecast.Model40_98
import com.awesomeapp.forecast.Activity40_99
import com.awesomeapp.forecast.Model40_101
import com.awesomeapp.forecast.Activity40_102
import com.awesomeapp.forecast.Model40_104
import com.awesomeapp.forecast.Activity40_105
import com.awesomeapp.forecast.Model40_107
import com.awesomeapp.forecast.Activity40_108
import com.awesomeapp.forecast.Model40_110
import com.awesomeapp.forecast.Activity40_111
import com.awesomeapp.forecast.Model40_113
import com.awesomeapp.forecast.Activity40_114
import com.awesomeapp.forecast.Model40_116
import com.awesomeapp.forecast.Activity40_117
import com.awesomeapp.forecast.Model40_119
import com.awesomeapp.forecast.Activity40_120
import com.awesomeapp.forecast.Model40_122
import com.awesomeapp.forecast.Activity40_123
import com.awesomeapp.forecast.Model40_125
import com.awesomeapp.forecast.Activity40_126
import com.awesomeapp.forecast.Model40_128
import com.awesomeapp.forecast.Activity40_129
import com.awesomeapp.forecast.Model40_131
import com.awesomeapp.forecast.Activity40_132
import com.awesomeapp.forecast.Model40_134
import com.awesomeapp.forecast.Activity40_135
import com.awesomeapp.forecast.Model40_137
import com.awesomeapp.forecast.Activity40_138
import com.awesomeapp.forecast.Model40_140
import com.awesomeapp.forecast.Activity40_141
import com.awesomeapp.forecast.Model40_143
import com.awesomeapp.forecast.Activity40_144
import com.awesomeapp.forecast.Model40_146
import com.awesomeapp.forecast.Activity40_147
import com.awesomeapp.forecast.Model40_149
import com.awesomeapp.forecast.Activity40_150
import com.awesomeapp.forecast.Model40_152
import com.awesomeapp.forecast.Activity40_153
import com.awesomeapp.forecast.Model40_155
import com.awesomeapp.forecast.Activity40_156
import com.awesomeapp.forecast.Model40_158
import com.awesomeapp.forecast.Activity40_159
import com.awesomeapp.forecast.Model40_161
import com.awesomeapp.forecast.Activity40_162
import com.awesomeapp.forecast.Model40_164
import com.awesomeapp.forecast.Activity40_165
import com.awesomeapp.forecast.Model40_167
import com.awesomeapp.forecast.Activity40_168
import com.awesomeapp.forecast.Model40_170
import com.awesomeapp.forecast.Activity40_171
import com.awesomeapp.forecast.Model40_173
import com.awesomeapp.forecast.Activity40_174
import com.awesomeapp.forecast.Model40_176
import com.awesomeapp.forecast.Activity40_177
import com.awesomeapp.forecast.Model40_179
import com.awesomeapp.forecast.Activity40_180
import com.awesomeapp.forecast.Model40_182
import com.awesomeapp.forecast.Activity40_183
import com.awesomeapp.forecast.Model40_185
import com.awesomeapp.forecast.Activity40_186
import com.awesomeapp.forecast.Model40_188
import com.awesomeapp.forecast.Activity40_189
import com.awesomeapp.forecast.Model40_191
import com.awesomeapp.forecast.Activity40_192
import com.awesomeapp.forecast.Model40_194
import com.awesomeapp.forecast.Activity40_195
import com.awesomeapp.forecast.Model40_197
import com.awesomeapp.forecast.Activity40_198
import com.awesomeapp.forecast.Model40_200
import com.awesomeapp.forecast.Activity40_201
import com.awesomeapp.forecast.Model40_203
import com.awesomeapp.forecast.Activity40_204
import com.awesomeapp.forecast.Model40_206
import com.awesomeapp.forecast.Activity40_207
import com.awesomeapp.forecast.Model40_209
import com.awesomeapp.forecast.Activity40_210
import com.awesomeapp.forecast.Model40_212
import com.awesomeapp.forecast.Activity40_213
import com.awesomeapp.forecast.Model40_215
import com.awesomeapp.forecast.Activity40_216
import com.awesomeapp.forecast.Model40_218
import com.awesomeapp.forecast.Activity40_219
import com.awesomeapp.forecast.Model40_221
import com.awesomeapp.forecast.Activity40_222
import com.awesomeapp.forecast.Model40_224
import com.awesomeapp.forecast.Activity40_225
import com.awesomeapp.forecast.Model40_227
import com.awesomeapp.forecast.Activity40_228
import com.awesomeapp.forecast.Model40_230
import com.awesomeapp.forecast.Activity40_231
import com.awesomeapp.forecast.Model40_233
import com.awesomeapp.forecast.Activity40_234
import com.awesomeapp.forecast.Model40_236
import com.awesomeapp.forecast.Activity40_237
import com.awesomeapp.forecast.Model40_239
import com.awesomeapp.forecast.Activity40_240
import com.awesomeapp.forecast.Model40_242
import com.awesomeapp.forecast.Activity40_243
import com.awesomeapp.forecast.Model40_245
import com.awesomeapp.forecast.Activity40_246
import com.awesomeapp.forecast.Model40_248
import com.awesomeapp.forecast.Activity40_249
import com.awesomeapp.forecast.Model40_251
import com.awesomeapp.forecast.Activity40_252
import com.awesomeapp.forecast.Model40_254
import com.awesomeapp.forecast.Activity40_255
import com.awesomeapp.forecast.Model40_257
import com.awesomeapp.forecast.Activity40_258
import com.awesomeapp.forecast.Model40_260
import com.awesomeapp.forecast.Activity40_261
import com.awesomeapp.forecast.Model40_263
import com.awesomeapp.forecast.Activity40_264
import com.awesomeapp.forecast.Model40_266
import com.awesomeapp.forecast.Activity40_267
import com.awesomeapp.forecast.Model40_269
import com.awesomeapp.forecast.Activity40_270
import com.awesomeapp.forecast.Model40_272
import com.awesomeapp.forecast.Activity40_273
import com.awesomeapp.forecast.Model40_275
import com.awesomeapp.forecast.Activity40_276
import com.awesomeapp.forecast.Model40_278
import com.awesomeapp.forecast.Activity40_279
import com.awesomeapp.forecast.Model40_281
import com.awesomeapp.forecast.Activity40_282
import com.awesomeapp.forecast.Model40_284
import com.awesomeapp.forecast.Activity40_285
import com.awesomeapp.forecast.Model40_287
import com.awesomeapp.forecast.Activity40_288
import com.awesomeapp.forecast.Model40_290
import com.awesomeapp.forecast.Activity40_291
import com.awesomeapp.forecast.Model40_293
import com.awesomeapp.forecast.Activity40_294
import com.awesomeapp.forecast.Model40_296
import com.awesomeapp.forecast.Activity40_297
import com.awesomeapp.forecast.Model40_299
import com.awesomeapp.forecast.Activity40_300

@Module
@InstallIn(SingletonComponent::class)
object Module_40 {
    @Provides
    @Singleton
    fun provideRepository40_5(
        api0: Api32_6 = Api32_6(),
        api1: Api28_6 = Api28_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api16_6 = Api16_6(),
        api4: Api24_6 = Api24_6(),
        api5: Api20_6 = Api20_6()
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