package com.airatlovesmusic.multik.di.app

import com.airatlovesmusic.global.di.dependencies.ComponentDependencies
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class ComponentDependenciesKey(val value: KClass<out ComponentDependencies>)