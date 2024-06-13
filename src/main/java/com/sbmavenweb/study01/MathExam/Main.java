package com.sbmavenweb.study01.MathExam;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Scanner;
@Getter
@Setter
public class Main {
    final int MAX_BALANCE = 0;
    final int MIN_BALANCE = 0;
    private int balance;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if ( balance < 0 || balance > 1000000) {
            return;
        } else {
            this.balance = balance;
        }
    }
    public static void main(String args[]) {
            Main a = new Main();

            a.setBalance(10000);
            System.out.println("현재 잔고 : " + a.getBalance());

            a.setBalance(-100);
            System.out.println("현재 잔고 : " + a.getBalance());
    }
}