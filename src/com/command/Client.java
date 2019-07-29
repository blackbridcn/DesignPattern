package com.command;


import com.command.command.Command;
import com.command.command.impl.AccountInCommand;
import com.command.command.impl.AccountOutCommand;
import com.command.invoker.Invoker;
import com.command.receiver.Account;

public class Client {

    /**
     * 命令模式：解决行为发起者与行为实现者之间的耦合;
     * <p>
     * 它将一个发起者请求封装成一个对象，将发起者和执行者分开来，通过命令的方式来实现；
     * 命令模式的根本目的在于将“行为请求者”与“行为实现者”解耦，在面向对象的语言中，
     * 常见的手段是“将行为抽象为对象”。因此，凡是需要将调用和实现分开处理的情况都可以使用命令模式。
     * <p>
     * 基于界面和事件触发的场景都适合命令模式。
     * <p>
     * 请求执行者（接收者）：知道如何实施与执行一个请求相关的操作，任何类都可能作为一个接收者；
     * <p>
     * 命令（接口）：先声明执行操作的接口Command，并可以根据该接口有多个实现;
     * 命令实体(命令实现类)：在实现类中将一个 接收者对象 绑定于一个对象,调用接收者相应的操作，以实现命令角色声明的执行操作的接口
     * <p>
     * 请求发起者：invoker调用命令对象执行这个请求
     * <p>
     * 适用场景：
     * 命令模式最常见的应用场景是：有时候需要向某些对象发送请求，但是并不知道请求的接收
     * 者是谁，也不知道被请求的操作是什么。此时希望用一种松耦合的方式来设计程序，
     * 使得请求发送者和请求接收者能够消除彼此之间的耦合关系。
     */
    private static Account account;

    public static void main(String[] args) {
        // 创建银行帐号
        account = new Account();

        // 存200块钱
        Command commandIn = new AccountInCommand(account, 200);

        // 创建一个调度者
        Invoker invoker0 = new Invoker(commandIn);
        // 告诉调度者我要存钱
        // invoker0.setCommand(commandIn);
        // 干活
        invoker0.executeCommand();


        // 取200块钱
        Command commandOut = new AccountOutCommand(account, 200);
        // 创建一个调度者
        Invoker invoker1 = new Invoker(commandOut);
        // 告诉调度者我要存钱
        //invoker1.setCommand(commandOut);
        // 干活
        invoker1.executeCommand();


    }
}
