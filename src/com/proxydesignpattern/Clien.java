package com.proxydesignpattern;

import com.proxydesignpattern.dynamicproxy.DynamicProxySubject;
import com.proxydesignpattern.staticproxy.HolderProxySubject;
import com.proxydesignpattern.subject.Subject;
import com.proxydesignpattern.subject.impl.TimeTaskSubject;

public class Clien {

    public static void main(String[] args) {
        // write your code here
        TimeTaskSubject subject = new TimeTaskSubject();
        DynamicProxySubject autoProxy = new DynamicProxySubject();
        Subject bind =(Subject) autoProxy.Bind(subject);
        bind.doSomeThing();
        bind.doSomeThing(10);
        bind.doSomeTask(11,"动态代理");

        HolderProxySubject holderProxy = new HolderProxySubject(subject);
        holderProxy.doSomeThing();
        holderProxy.doSomeThing(20);
        holderProxy.doSomeTask(21,"静态代理");

    }
}
