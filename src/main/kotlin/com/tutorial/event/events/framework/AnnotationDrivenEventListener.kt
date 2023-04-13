package com.tutorial.event.events.framework

import org.slf4j.LoggerFactory
import org.springframework.context.event.ContextStartedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class AnnotationDrivenEventListener {
    private val log = LoggerFactory.getLogger(javaClass)

    @EventListener
    fun handleContextStart(event: ContextStartedEvent) {
        log.info("Handling context started event.")
    }
}