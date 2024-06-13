package com.sbmavenweb.study01.MathExam;

import java.util.Scanner;

public class BankApplication {


    public BankApplication() {

    }
    public void makeAccount() {

    }
    public void checkAccount() {

    }
    public void plusMoney(){

    }
    public void minusMoney() {

    }
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        boolean a = true;
        BankApplication b = new BankApplication();
        while (a) {
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.println("선택>");
            int input = x.nextInt();
            System.out.println("--------");
            switch (input) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    a = false;
                    break;
            }
        }


    }
}
