package com.airatlovesmusic.global.di

import javax.inject.Scope

@Scope
annotation class ApplicationScope

@Scope
annotation class PerFeature

@Scope
annotation class PerFragment

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerFlow