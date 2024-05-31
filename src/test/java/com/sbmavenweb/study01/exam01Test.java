package com.sbmavenweb.study01;

import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exam01Test {
    @Test
    public void subtract01() throws Exception{
        //given 테스트를 위한 준비값
        int num1 = 2;
        int num2 = 3;
        int expected = -1;
        //when 테스트를 실시
        int actual = subTest01(num1, num2);

        //then 실제값과 기대값을 비교해서 테스트한다
        assertThat(actual).isEqualTo(expected);
        assertThat(-1).isEqualTo(subTest01(2, 3));
        assertThat(29).isLessThan(subTest01(100, 70));
        assertThat(301).isGreaterThan(subTest01(1000, 700));

        //Exception 예외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> subTest01(70000, 7))
                .isInstanceOf(Exception.class);
        //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception  = assertThrows(RuntimeException.class, () -> {
            subTest01(2330, 50002);
        });
        System.out.println(exception.toString());
    }
    int subTest01(int n1, int n2) throws Exception{
        if( n1 < -50000 || n1 > 50000) {
            throw new Exception("num1값은 -50000보다 작거나 50000보다 클 수 없습니다.");
        }
        if( n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2값은 -50000보다 작거나 50000보다 클 수 없습니다.");
        }
        return n1 - n2;
    }
}
