package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
        
    public void Account (String accountNo) {
    	this.accountNo = accountNo;
    	int balace = 0;
        }
    //필요한 메소드 작성
    public String getAccountNo() { 	// 계좌번호 조회
    	return this.accountNo;
    }
    
    public int getBalance() {  // 잔액조회
    	return this.balance;
    }
    
    
    public void setBalance(int balance) {  // 잔액조회
    	this.balance = balance;
    }
    
    public void deposit() { // 입금
    	return balance += 
    }
    
    public void withdraw() {	// 출금
    	
    }
    
    public void showBalance() {		
    	
    }
   

}
