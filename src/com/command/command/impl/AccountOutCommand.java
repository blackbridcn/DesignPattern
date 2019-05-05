package com.command.command.impl;


import com.command.command.Command;
import com.command.receiver.Account;

/**
 * ConcreteCommand取钱：
 */
public class AccountOutCommand  extends Command {
    private int money;

    public AccountOutCommand(Account account, int money){
        super(account);
        this.money = money;
    }

    /**
     * 取钱操作
     */
    @Override
    public void action() {
        account.accountOut(money);
    }
}

