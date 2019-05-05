package com.command.receiver;

import java.util.ArrayList;
import java.util.List;

/**
 * Receiver：具体执行请求操作类，其具体方法叫行动方法。
 */
public class Account {
    private int totalAmount = 0;
    // 简单的维护一个账单流水
    private List<Integer> moperations = new ArrayList<>();

    /**
     * 存钱
     * @param money 存钱金额
     */
    public void accountIn(int money){
        this.totalAmount += money;
        moperations.add(money);
    }

    /**
     * 取钱
     * @param money 取钱金额
     */
    public void accountOut(int money){
        totalAmount -= money;
        moperations.add(money);
    }

    /**
     * 查询余额
     * @return
     */
    public int getAccountAmout(){
        return totalAmount;
    }

    /**
     * 获取账单流水
     * @return
     */
    public String getBill(){
        String simpleBill = new String();
        for (Integer money:moperations){
            if(money < 0){
                simpleBill += "取钱：" + money + "\n";
            }else {
                simpleBill += "存钱：" + money + "\n";
            }
        }
        return simpleBill;
    }

}
