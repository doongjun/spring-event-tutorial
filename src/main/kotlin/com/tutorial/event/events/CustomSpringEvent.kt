package com.tutorial.event.events

import org.springframework.context.ApplicationEvent

class CustomSpringEvent(
    source: Any,
    val message: String?
): ApplicationEvent(source)