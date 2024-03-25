package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double doller;
        double won;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        double wonToDollar = CConverter.toDollar(1000000);
        System.out.println("백만원은 " + wonToDollar + " 달러 입니다.");
          
        //100달려를 원으로 출력하기
        
        double dollarToWon = CConverter.toKWR(100);
        System.out.println("백만원은 " + dollarToWon + " 원 입니다.");        
        
    }

}
