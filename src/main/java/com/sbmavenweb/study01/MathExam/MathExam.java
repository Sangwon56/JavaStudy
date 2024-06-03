package com.sbmavenweb.study01.MathExam;


public class MathExam {

    public int subTest01(int n1, int n2) throws Exception {
        if (n1 < -50000 || n1 > 50000) {
            throw new Exception("num1값은 -50000보다 작거나 50000보다 클 수 없습니다.");
        }
        if (n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2값은 -50000보다 작거나 50000보다 클 수 없습니다.");
        }
        return n1 - n2;
    }

    public int mulTest01(int n1, int n2) throws Exception {
        if (n1 <= 0 || n1 >= 100) {
            throw new Exception("num1의 값은 0과 100의 사잇값이어야 합니다.");
        }
        if (n2 <= 0 || n2 >= 100) {
            throw new Exception("num1의 값은 0과 100의 사잇값이어야 합니다.");
        }
        return n1 * n2;
    }

    public int divTest01(int n1, int n2) throws Exception {
        if (n1 <= 0 || n1 > 100) {
            throw new Exception("num1의 값은 0보다 크거나 100보다 작아야 합니다.");
        }
        if (n2 <= 0 || n2 > 100) {
            throw new Exception("num2의 값은 0보다 크거나 100보다 작아야 합니다.");
        }
        return n1 / n2;
    }

    public int compareTest01(int n1, int n2) throws Exception {
        if (n1 < 0 || n1 > 10000) {
            throw new Exception("num1의 값은 0과 10000의 사잇값이어야 합니다.");
        }
        if (n2 < 0 || n2 > 10000) {
            throw new Exception("num1의 값은 0과 10000의 사잇값이어야 합니다.");
        }
        return (n1 == n2 ? 1 : -1);
    }

    public double exam120817(int[] numbers) throws Exception {
        int sum = 0;
        double avg = 0;
        if ( numbers == null) {
            throw new Exception("numbers 는 null 이 아니어야 합니다.");
        }
        if (numbers.length < 1 || numbers.length > 100) {
            throw new Exception("numbers 배열 크기는 1~100개 사이여야 합니다.");
        }
        for ( int i = 0; i < numbers.length; i++ ) {
            if ( numbers[i] < 0 || numbers[i] > 1000) {
                throw new Exception(String.format("numbers[%d]의 값은 0~1000개 사이여야 합니다.", i));
                            }
            sum += numbers[i];
            avg = (double)sum / numbers.length;
        }
        return avg;
    }
}
