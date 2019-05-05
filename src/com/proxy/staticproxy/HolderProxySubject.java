package com.proxy.staticproxy;

import com.proxy.subject.Subject;

public class HolderProxySubject implements Subject {

    private Subject mSubject;

    public HolderProxySubject(Subject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void doSomeThing() {
        if(this.mSubject!=null){
            this.mSubject.doSomeThing();
        }
    }

    @Override
    public void doSomeThing(int id) {
        if(this.mSubject!=null){
            this.mSubject.doSomeThing(id);
        }
    }

    @Override
    public void doSomeTask(int id, String name) {
        if(this.mSubject!=null){
            this.mSubject.doSomeTask(id,name);
        }
    }
}
