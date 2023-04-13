package com.tutorial.event.events.framework.generic

class GenericSpringEvent<T>(
    val what: T,
    val success: Boolean
)