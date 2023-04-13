package com.tutorial.event.springevents

class GenericStringSpringEvent internal constructor(
    what: String,
    success: Boolean
): GenericSpringEvent<String>(what, success)