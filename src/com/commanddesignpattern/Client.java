package com.commanddesignpattern;


import com.commanddesignpattern.command.Command;
import com.commanddesignpattern.command.impl.AccountInCommand;
import com.commanddesignpattern.command.impl.AccountOutCommand;
import com.commanddesignpattern.invoker.Invoker;
import com.commanddesignpattern.receiver.Account;

public class Client {


    private static Account account;

    public static void main(String[] args) {
        // 创建银行帐号
        account = new Account();


        // 存200块钱
        Command commandIn = new AccountInCommand(account,200);
        // 创建一个调度者
        Invoker invoker0 = new Invoker(commandIn);
        // 告诉调度者我要存钱
       // invoker0.setCommand(commandIn);
        // 干活
        invoker0.executeCommand();


        // 取200块钱
        Command commandOut = new AccountOutCommand(account,200);
        // 创建一个调度者
        Invoker invoker1 = new Invoker(commandOut);
        // 告诉调度者我要存钱
        //invoker1.setCommand(commandOut);
        // 干活
        invoker1.executeCommand();



    }
}
