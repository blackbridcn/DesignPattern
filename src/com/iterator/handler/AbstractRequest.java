package com.iterator.handler;

import java.io.ObjectInputStream;

public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求级别
     *
     * @return
     */
    public abstract int getRequestLevel();
}
