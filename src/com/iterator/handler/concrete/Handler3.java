package com.iterator.handler.concrete;

import com.iterator.handler.AbstractHandler;
import com.iterator.handler.AbstractRequest;

public class Handler3 extends AbstractHandler {
    @Override
    public int getHandlerLevel() {
        return 3;
    }

    @Override
    public void handler(AbstractRequest request) {
        System.out.println(Handler3.class.getName()+ " Handler request :"+request.getRequestLevel());
    }
}
