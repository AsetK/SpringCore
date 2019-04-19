package com.epam.eventlistening;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Cat implements ApplicationEventPublisherAware {

    private String name = "kisa";
    private ApplicationEventPublisher eventPublisher;

    public void speak()
    {
        SpeakEvent speakEvent = new SpeakEvent(this);
        eventPublisher.publishEvent(speakEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
