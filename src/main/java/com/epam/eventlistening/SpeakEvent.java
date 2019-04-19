package com.epam.eventlistening;

import org.springframework.context.ApplicationEvent;

public class SpeakEvent extends ApplicationEvent {

    public SpeakEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "SpeakEvent{} - " + this.source;
    }
}
