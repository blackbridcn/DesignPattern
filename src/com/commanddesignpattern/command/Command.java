package com.commanddesignpattern.command;


import com.commanddesignpattern.receiver.Account;

public abstract class Command {
    // 账户类
    protected Account account;

    public Command(Account account)
    {
        this.account = account;
    }

    // 抽象命令执行方法
    public abstract void action();

}