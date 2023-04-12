package com.tutorial.event.events.refresh

import org.springframework.context.ApplicationEvent

class ContextRefreshEvent(
    source: Any,
    val message: String?
): ApplicationEvent(source)