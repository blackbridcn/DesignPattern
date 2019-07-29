package com.mediator.mediator;

import com.mediator.colleague.Colleague;
import com.mediator.colleague.concrete.ConcreteColleagueA;
import com.mediator.colleague.concrete.ConcreteColleagueB;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {


    private Map<String, Colleague> map = new HashMap<>();

    public void setColleague(Colleague mColleague) {
        map.put(buildKey(mColleague), mColleague);
    }

    public Colleague getColleagueObjct(String key) {
        return map.get(key);
    }

    protected String buildKey(Colleague mColleague) {
        if (mColleague != null) {
            return mColleague.getClass().getName();
        }
        return "Colleague_Key";
    }

    public abstract void onCoreMethod(Colleague mColleague);
}
