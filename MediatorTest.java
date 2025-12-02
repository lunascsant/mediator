package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MediatorTest {
    @Test
    void testSendMessageFromAToB() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);
        a.send("Mensagem de A para B");
        assertEquals("Mensagem de A para B", b.getLastMessage());
    }

    @Test
    void testSendMessageFromBToA() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);
        b.send("Mensagem de B para A");
        assertEquals("Mensagem de B para A", a.getLastMessage());
    }

    @Test
    void testReceiveMessageInB() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);
        a.send("Teste B");
        assertEquals("Teste B", b.getLastMessage());
    }

    @Test
    void testReceiveMessageInA() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);
        b.send("Teste A");
        assertEquals("Teste A", a.getLastMessage());
    }

    @Test
    void testMultipleMessages() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);
        a.send("Primeira mensagem");
        b.send("Segunda mensagem");
        a.send("Terceira mensagem");
        assertEquals("Terceira mensagem", b.getLastMessage());
        assertEquals("Segunda mensagem", a.getLastMessage());
    }
}

