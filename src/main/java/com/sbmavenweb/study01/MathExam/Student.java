package com.sbmavenweb.study01.MathExam;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;
@Getter
@Setter
public class Student extends Object{
    private String name;
    private int score;

    @Override
    public String toString() {
        return String.format("%s : %d", name, score);
    }

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int dataCount = x.nextInt();
        int displayCount = x.nextInt();
        Student[] students = new Student[dataCount];

        for (int i = 0; i < students.length; i++) {
            String name = x.next();
            int score = x.nextInt();
            students[i] = new Student();
            students[i].setName(name);
            students[i].setScore(score);
        }

//        Student[] sortedStudents = new Student[students.length];
//        int ndx = 0;
        for (int i = 0; i < students.length; i++){
            for (int j = i; j < students.length; j++){
                if (students[i].getScore() < students[j].getScore()){
                    String tempName = students[i].getName();
                    int tempScore = students[i].getScore();

                    students[i].setName(students[j].getName());
                    students[i].setScore(students[j].getScore());

                    students[j].setName(tempName);
                    students[j].setScore(tempScore);
                }
            }
        }
        for (int i = 0; i < displayCount; i++) {
            System.out.println(students[i]);
        }
    }
}
