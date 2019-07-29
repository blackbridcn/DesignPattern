package com.mediator.mediator.concrete;

import com.mediator.colleague.Colleague;
import com.mediator.mediator.Mediator;

public class ConcreteMediator extends Mediator {

    public ConcreteMediator() {
    }

    @Override
    public void onCoreMethod(Colleague mColleague) {
        getColleagueObjct(buildKey(mColleague)).doActionTask();
    }
}
