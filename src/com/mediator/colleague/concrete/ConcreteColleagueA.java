package com.mediator.colleague.concrete;

import com.mediator.colleague.Colleague;
import com.mediator.mediator.Mediator;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mMediator) {
        super(mMediator);
    }

    @Override
    public void doActionTask() {
        System.out.println("ConcreteColleagueA  ------------>  action ");
    }
}
