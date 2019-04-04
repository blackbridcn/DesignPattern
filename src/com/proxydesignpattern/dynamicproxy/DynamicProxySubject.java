package com.proxydesignpattern.dynamicproxy;

import com.proxydesignpattern.subject.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxySubject implements InvocationHandler {

    private Object target;

    public Object Bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理START---->");
        Object invoke = method.invoke(this.target, args);
        System.out.println("动态代理END---->");
        return invoke;
    }
}
