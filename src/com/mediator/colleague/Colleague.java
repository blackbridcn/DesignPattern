package com.mediator.colleague;

import com.mediator.mediator.Mediator;

public abstract  class Colleague {

   protected Mediator mMediator;

    public Colleague(Mediator mMediator) {
        this.mMediator = mMediator;
    }

    public abstract void doActionTask();
}
