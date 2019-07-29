package com.mediator.colleague.concrete;

import com.mediator.colleague.Colleague;
import com.mediator.mediator.Mediator;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mMediator) {
        super(mMediator);
    }

    @Override
    public void doActionTask() {
        System.out.println("--------------> ConcreteColleagueB doActionTask:");
    }
}
