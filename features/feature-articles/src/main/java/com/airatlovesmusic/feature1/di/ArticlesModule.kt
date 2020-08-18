package com.airatlovesmusic.feature1.di

import com.airatlovesmusic.global.di.vm.ViewModelModule
import dagger.Module

@Module(
    includes = [
        ViewModelModule::class
    ]
)
class ArticlesModule {}