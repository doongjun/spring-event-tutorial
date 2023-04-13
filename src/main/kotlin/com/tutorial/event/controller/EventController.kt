package com.tutorial.event.controller

import com.tutorial.event.springevents.CustomSpringEventPublisher
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EventController(
    private val customSpringEventPublisher: CustomSpringEventPublisher
) {
    @GetMapping("/custom")
    fun customEvent(
        message: String
    ) {
        customSpringEventPublisher.publishCustomEvent(message)
    }

    @GetMapping("/generic")
    fun customEvent(
        message: String,
        success: Boolean
    ) {
        customSpringEventPublisher.publishGenericSpringEvent(message, success)
    }
}