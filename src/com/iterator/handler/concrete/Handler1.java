package com.iterator.handler.concrete;

import com.iterator.handler.AbstractHandler;
import com.iterator.handler.AbstractRequest;


public class Handler1 extends AbstractHandler {

    @Override
    public int getHandlerLevel() {
        return 1;
    }

    @Override
    public void handler(AbstractRequest request) {
        System.out.println(Handler1.class.getName()+ " Handler request :"+request.getRequestLevel());
    }
}
