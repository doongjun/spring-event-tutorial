package com.tutorial.event.springevents

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

    fun publishGenericSpringEvent(message: String, success: Boolean) {
        log.info("Publishing generic event")
        val genericSpringEvent: GenericSpringEvent<String> = GenericStringSpringEvent(message, success)
        applicationEventPublisher.publishEvent(genericSpringEvent)
    }
}