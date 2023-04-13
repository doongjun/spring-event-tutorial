package com.tutorial.event.springevents.synchronous

import com.tutorial.event.springevents.AnnotationDrivenEventListener
import com.tutorial.event.springevents.ContextRefreshedListener
import com.tutorial.event.springevents.CustomSpringEventPublisher
import com.tutorial.event.springevents.syncronous.SynchronousSpringEventsConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.support.AnnotationConfigContextLoader

@ExtendWith(SpringExtension::class)
@ContextConfiguration(classes = [SynchronousSpringEventsConfig::class], loader = AnnotationConfigContextLoader::class)
class SynchronousCustomSpringEventsIntegrationTest {
    @Autowired
    private lateinit var publisher: CustomSpringEventPublisher
    @Autowired
    private lateinit var annotationDrivenEventListener: AnnotationDrivenEventListener
    @Autowired
    private lateinit var contextRefreshedListener: ContextRefreshedListener

    @Test
    fun `testContextRefreshedEvent`() {
        assertThat(contextRefreshedListener.isHitContextRefreshedHandler()).isTrue
    }

    @Test
    fun `testHandleSuccessfulEvent`() {
        publisher.publishGenericSpringEvent("dont listen", false)
        assertThat(annotationDrivenEventListener.isHitSuccessfulEventHandler()).isFalse

        publisher.publishGenericSpringEvent("listen", true)
        assertThat(annotationDrivenEventListener.isHitSuccessfulEventHandler()).isTrue
    }

}