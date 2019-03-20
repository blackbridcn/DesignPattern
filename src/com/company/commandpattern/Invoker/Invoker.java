package com.company.commandpattern.Invoker;


import com.company.commandpattern.Command.Command;

/**
 * 负责调用命令对象执行请求，相关的方法叫做行动方法。
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    /**
     * 具体执行类
     */
    public void executeCommand(){
        command.action();
    }

}
