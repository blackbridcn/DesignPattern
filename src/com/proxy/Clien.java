package com.proxy;

import com.proxy.dynamicproxy.DynamicProxySubject;
import com.proxy.staticproxy.HolderProxySubject;
import com.proxy.subject.Subject;
import com.proxy.subject.help.DynamicProxyParams;
import com.proxy.subject.impl.TimeTaskSubject;

public class Clien {

    public static void main(String[] args) {
        // write your code here
        TimeTaskSubject subject = new TimeTaskSubject();
        DynamicProxySubject autoProxy = new DynamicProxySubject();
        Subject bind = (Subject) autoProxy.Bind(subject);
        bind.doSomeThing(() -> {
            return false;
        });
        bind.doSomeThing(10);
        bind.doSomeTask(11, "动态代理");

  /*      HolderProxySubject holderProxy = new HolderProxySubject(subject);
        holderProxy.doSomeThing();
        holderProxy.doSomeThing(20);
        holderProxy.doSomeTask(21, "静态代理");*/

    }
}
