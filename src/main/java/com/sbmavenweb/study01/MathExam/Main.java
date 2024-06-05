package com.sbmavenweb.study01.MathExam;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.next();

        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            System.out.println(ch);
        }
    }
}
