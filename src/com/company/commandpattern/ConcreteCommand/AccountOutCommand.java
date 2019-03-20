package com.company.commandpattern.ConcreteCommand;


import com.company.commandpattern.Command.Command;
import com.company.commandpattern.receiver.Account;

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

