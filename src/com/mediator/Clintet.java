package com.mediator;


import com.mediator.colleague.concrete.ConcreteColleagueA;
import com.mediator.colleague.concrete.ConcreteColleagueB;
import com.mediator.mediator.Mediator;
import com.mediator.mediator.concrete.ConcreteMediator;

public class Clintet {

    public static void main(String[] args) {
        Mediator mMediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA= new ConcreteColleagueA(mMediator);
        ConcreteColleagueB colleagueB= new ConcreteColleagueB(mMediator);
        mMediator.setColleague(colleagueA);
        mMediator.setColleague(colleagueB);

        mMediator.onCoreMethod(colleagueB);
    }
}
