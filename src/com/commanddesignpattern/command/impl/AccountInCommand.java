package com.commanddesignpattern.command.impl;


import com.commanddesignpattern.command.Command;
import com.commanddesignpattern.receiver.Account;

/**
 * 定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。
 *
 * 然后定义ConcreteCommand类，这里只定义存钱和取钱：
 */
public class AccountInCommand  extends Command {
    private int money;

    public AccountInCommand(Account account, int money) {
        super(account);
        this.money = money;
    }

    /**
     * 存钱操作
     */
    @Override
    public void action() {
        account.accountIn(money);
    }
}
