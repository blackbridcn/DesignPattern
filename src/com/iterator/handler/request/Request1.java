package com.iterator.handler.request;

import com.iterator.handler.AbstractRequest;

public class Request1 extends AbstractRequest {

    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
