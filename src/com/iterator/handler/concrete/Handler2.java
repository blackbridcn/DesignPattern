package com.iterator.handler.concrete;

import com.iterator.handler.AbstractHandler;
import com.iterator.handler.AbstractRequest;

public class Handler2  extends AbstractHandler {


    @Override
    public int getHandlerLevel() {
        return 2;
    }

    @Override
    public void handler(AbstractRequest request) {
        System.out.println(Handler2.class.getName()+ " Handler request :"+request.getRequestLevel());
    }
}
