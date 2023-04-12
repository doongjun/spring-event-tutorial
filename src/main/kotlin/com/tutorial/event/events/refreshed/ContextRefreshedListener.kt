package com.tutorial.event.events.refreshed

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent

// Existing Framework Events - ContextRefreshedEvent, ContextStartedEvent, RequestHandledEvent etc.
class ContextRefreshedListener: ApplicationListener<ContextRefreshedEvent> {
    private val log = LoggerFactory.getLogger(javaClass)

    override fun onApplicationEvent(event: ContextRefreshedEvent) {
        log.info("Handling context re-freshed event.")
    }
}