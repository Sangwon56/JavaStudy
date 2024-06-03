package com.sbmavenweb.study01;

import com.sbmavenweb.study01.MathExam.MathExam;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class exam01Test {
    @Test
    public void subtract01() throws Exception {
        MathExam math = new MathExam();
        //given 테스트를 위한 준비값
        int num1 = 2;
        int num2 = 3;
        int expected = -1;
        //when 테스트를 실시
        int actual = math.subTest01(num1, num2);

        //then 실제값과 기대값을 비교해서 테스트한다
        assertThat(actual).isEqualTo(expected);
        assertThat(-1).isEqualTo(math.subTest01(2, 3));
        assertThat(29).isLessThan(math.subTest01(100, 70));
        assertThat(301).isGreaterThan(math.subTest01(1000, 700));

        //Exception 예외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.subTest01(70000, 7))
                .isInstanceOf(Exception.class);
        //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.subTest01(2330, 50002);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void multiply01() throws Exception {
        // given
        MathExam math = new MathExam();

        // when
        // then
        assertThat(12).isEqualTo(math.mulTest01(3, 4));
        assertThat(513).isEqualTo(math.mulTest01(27, 19));
        assertThatThrownBy(() -> math.mulTest01(-1, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mulTest01(10, 101))
                .isInstanceOf(Exception.class);

    }

    @Test
    public void divide01() throws Exception {
        //given
        MathExam math = new MathExam();
        //when
        //then
        assertThat(2).isEqualTo(math.divTest01(10, 5));
        assertThat(3).isEqualTo(math.divTest01(7, 2));
        assertThatThrownBy(() -> math.divTest01(-1, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.divTest01(10, 101))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void compare01() throws Exception {
        //given
        MathExam math = new MathExam();
        //when
        //then
        assertThat(-1).isEqualTo(math.compareTest01(2, 3));
        assertThat(1).isEqualTo(math.compareTest01(11, 11));
        assertThat(-1).isEqualTo(math.compareTest01(7, 99));
        assertThatThrownBy(() -> math.compareTest01(-1, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.compareTest01(10, 10001))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120817() throws Exception
    {
        MathExam math = new MathExam();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(5.5).isEqualTo(math.exam120817(numbers));
        assertThat(94.0).isEqualTo(math.exam120817(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
//        assertThatThrownBy(() -> math.exam120817(new int[] {0, 1000, 2000}))
//                .isInstanceOf(Exception.class);
        Throwable exception = assertThrows(Exception.class, () -> {
            math.exam120817(new int[] {0, 1000, 2000});
        });
        System.out.println(exception.toString());
//        assertThatThrownBy(() -> math.exam120817(new int[] {}))
//                .isInstanceOf(Exception.class);
       exception = assertThrows(Exception.class, () -> math.exam120817(new int[] {}));
       System.out.println(exception.toString());
    }}