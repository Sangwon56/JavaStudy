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
        if (n1 < 0 || n1 > 100) {
            throw new Exception("num1의 값은 0과 100의 사잇값이어야 합니다.");
        }
        if (n2 < 0 || n2 > 100) {
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

    public int exam120820(int age) throws Exception{
        int year = 2024;
        if ( age <= 0 || age > 120) {
            throw new Exception("age 는 1과 120 사이여야 합니다.");
        }
        return year - age;
    }

    public int exam120829(int angle) throws Exception {
        int result = 0;

        if ( angle <= 0 || angle > 180) {
            throw new Exception("angle 은 0보다 크고 180보다 작거나 같아야 합니다.");
        }
        else if ( angle < 90) {
            result = 1;
        }
        else if ( angle == 90 ) {
            result = 2;
        }
        else if ( angle < 180) {
            result = 3;
        }
        else if ( angle == 180 ){
            result = 4;
        }
        return result;
    }

    public int exam120831(int n) throws Exception {
        int sum = 0;
        if ( n <= 0 || n > 1000) {
            throw new Exception("n 은 0보다 크고 1000보다 작거나 같아야 합니다.");
        }
        for (int i = 0; i <= n; i+=2 ){
                sum += i;
        }
        return sum;
    }

    public int[] exam120813(int n) throws Exception {
        if ( n <= 0 || n >= 101) {
            throw new Exception("n은 1~100 사이여야 합니다.");
        }
        int length = ( n + 1 ) / 2;
        int[] result = new int[length];
        int index = 0;
        for (int i = 1; i <= n; i += 2){
            result[index++] = i;
        }
        return result;
    }

    public int exam120818(int price) throws Exception {
        if ( price < 10 || price > 1000000) {
            throw new Exception("price 는 10과 1000000 사이여야 합니다.");
        }
        double sale_price = 0;
        if( price >= 100000 && price < 300000 ) {
            sale_price = (price * 0.95);
        }
        else if( price >= 300000 && price < 500000 ) {
            sale_price = (price * 0.9);
        }
        else if( price >= 500000 ) {
            sale_price = (price * 0.8);
        }
        return (int)sale_price;
    }

    public int exam120837(int hp) throws Exception {
        if (hp < 0 || hp > 1000) {
            throw new Exception("hp 는 0과 1000사이여야 합니다.");
        }
        int general = hp / 5;
        hp %= 5;

        int battle = hp / 3;
        hp %= 3;

        int total = general + battle + hp;
        return total;
    }
}
