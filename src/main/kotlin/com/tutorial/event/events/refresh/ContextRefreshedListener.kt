package com.tutorial.event.events.refresh

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener

class ContextRefreshedListener: ApplicationListener<ContextRefreshEvent> {
    private val log = LoggerFactory.getLogger(javaClass)

    override fun onApplicationEvent(event: ContextRefreshEvent) {
        log.info("Handling context re-freshed event. - " + event.message)
    }
}