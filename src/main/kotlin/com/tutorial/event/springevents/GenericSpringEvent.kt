package com.tutorial.event.springevents

open class GenericSpringEvent<T>(
    val what: T,
    val success: Boolean
)