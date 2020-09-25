package ru.startted.utils

fun Any.objectScopeName() = "${javaClass.simpleName}_${hashCode()}"