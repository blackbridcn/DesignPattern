package com.company.commandpattern.Command;


import com.company.commandpattern.receiver.Account;

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
