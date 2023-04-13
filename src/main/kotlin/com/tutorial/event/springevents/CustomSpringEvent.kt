package com.tutorial.event.springevents

import org.springframework.context.ApplicationEvent

class CustomSpringEvent(
    source: Any,
    val message: String?
): ApplicationEvent(source)