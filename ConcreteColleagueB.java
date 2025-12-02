package com.example;

public class ConcreteColleagueB extends Colleague {
    private String lastMessage;

    public ConcreteColleagueB(Mediator mediator) {
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

