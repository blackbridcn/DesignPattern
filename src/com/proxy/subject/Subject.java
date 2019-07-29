package com.proxy.subject;

import com.proxy.subject.help.DynamicProxyParams;

public interface Subject {

    void doSomeThing(DynamicProxyParams dynamicProxyParams);

    void doSomeThing(int id);

    void doSomeTask(int id, String name);
}
