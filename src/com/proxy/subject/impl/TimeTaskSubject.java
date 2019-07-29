package com.proxy.subject.impl;

import com.proxy.subject.Subject;
import com.proxy.subject.help.DynamicProxyParams;

public class TimeTaskSubject implements Subject {

  /*  @Override
    public void doSomeThing() {
        System.out.println("TimeTaskSubject doSomeThing------------------->");
    }*/

    @Override
    public void doSomeThing(DynamicProxyParams dynamicProxyParams) {
      boolean id=  dynamicProxyParams.onDynamicProxyParams();
        System.out.println("TimeTaskSubject doSomeThing(int id)-------------------> dynamicProxyParams :" + id);

    }

    @Override
    public void doSomeThing(int id) {
        System.out.println("TimeTaskSubject doSomeThing(int id)-------------------> id:" + id);
    }

    @Override
    public void doSomeTask(int id, String name) {
        System.out.println("TimeTaskSubject doSomeTask(int id, String name)-------------------> id:" + id + "  name:" + name);
    }
}
