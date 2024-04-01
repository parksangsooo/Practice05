package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    
    public Account (String accountNo) {
    	this.accountNo = accountNo;
    	this.balance = 0;
    }
    
    public void deposit(int money) {
        if (money > 0) {
            this.balance += money;
        } else {
            System.out.println("예금액은 양수로 입력해주세요.");
        }
    }
    
    public void withdraw(int money) {
        if (money > 0 && this.balance >= money) {
            this.balance -= money;
        } else if (money <= 0) {
            System.out.println("출금액은 양수로 입력해주세요.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    
    public void showBalance() {
        System.out.println(this.balance);
    }
}