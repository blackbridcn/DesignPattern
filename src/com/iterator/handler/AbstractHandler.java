package com.iterator.handler;

public abstract class AbstractHandler {
    //下一个节点的处理者
    public AbstractHandler nextHandler;

    /**
     * 处理请求
     *
     * @param request 请求条件
     */
    public final void handlerRequest(AbstractRequest request) {
        if (request.getRequestLevel() == getHandlerLevel()) {
            handler(request);
        }else if(nextHandler!=null){
            nextHandler.handler(request);
        }else {
            System.out.println("All of handler can not handler the request ");
        }
    }

    /**
     * 获取处理对象的处理级别
     *
     * @return
     */
    public abstract int getHandlerLevel();

    /**
     * 具体处理函数
     *
     * @param request
     */
    public abstract void handler(AbstractRequest request);
}
