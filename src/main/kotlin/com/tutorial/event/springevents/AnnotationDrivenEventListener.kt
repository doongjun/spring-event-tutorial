package com.tutorial.event.springevents

import org.slf4j.LoggerFactory
import org.springframework.context.event.ContextStartedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class AnnotationDrivenEventListener {
    private val log = LoggerFactory.getLogger(javaClass)

    // for tests
    private var hitContextStartedHandler = false
    private var hitSuccessfulEventHandler = false

    @EventListener(ContextStartedEvent::class)
    fun handleContextStart(event: ContextStartedEvent) {
        log.info("Handling context started event.")
        hitContextStartedHandler = true
    }

    @EventListener(condition = "#event.success")
    fun handleSuccessful(event: GenericSpringEvent<String>) {
        log.info("Handling generic event (conditional). ${event.what}")
        hitSuccessfulEventHandler = true
    }

    fun isHitContextStartedHandler() = hitContextStartedHandler
    fun isHitSuccessfulEventHandler() = hitSuccessfulEventHandler
}