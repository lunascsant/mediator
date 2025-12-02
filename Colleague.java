package com.example;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message);
    public void send(String message) {
        mediator.send(message, this);
    }
}

