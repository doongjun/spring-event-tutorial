package com.tutorial.event.springevents.syncronous

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.ApplicationEventMulticaster
import org.springframework.context.event.SimpleApplicationEventMulticaster

@Configuration
@ComponentScan("com.tutorial.event.springevents")
class SynchronousSpringEventsConfig {
//    @Bean(name = ["applicationEventMulticaster"])
//    fun simpleApplicationEventMulticaster(): ApplicationEventMulticaster {
//        return SimpleApplicationEventMulticaster()
//    }
}