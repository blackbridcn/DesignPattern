package com.iterator.handler.request;

import com.iterator.handler.AbstractRequest;

public class Request2 extends AbstractRequest {
    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
