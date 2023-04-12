package com.tutorial.event.events.custom

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener

class CustomSpringEventListener: ApplicationListener<CustomSpringEvent> {
    private val log = LoggerFactory.getLogger(javaClass)

    override fun onApplicationEvent(event: CustomSpringEvent) {
        log.info("Received spring custom event - " + event.message)
    }
}