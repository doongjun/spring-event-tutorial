package com.tutorial.event.events.custom

import org.springframework.context.ApplicationEvent

class CustomSpringEvent(
    source: Any,
    val message: String?
): ApplicationEvent(source)