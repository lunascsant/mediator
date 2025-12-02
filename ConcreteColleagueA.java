package com.example;

public class ConcreteColleagueA extends Colleague {
    private String lastMessage;

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        lastMessage = message;
    }

    public String getLastMessage() {
        return lastMessage;
    }
}

