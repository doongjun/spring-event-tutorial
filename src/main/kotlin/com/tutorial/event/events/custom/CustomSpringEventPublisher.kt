package com.tutorial.event.events

import com.tutorial.event.events.custom.CustomSpringEvent
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class CustomSpringEventPublisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    private val log = LoggerFactory.getLogger(javaClass)

    fun publishCustomEvent(message: String?) {
        log.info("Publishing custom event")
        val customSpringEvent = CustomSpringEvent(this, message)
        applicationEventPublisher.publishEvent(customSpringEvent)
    }
}