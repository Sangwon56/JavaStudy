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
        assertThat(math.subTest01(2, 3)).isEqualTo(-1);
        assertThat(math.subTest01(100, 70)).isLessThan(31);
        assertThat(math.subTest01(1000, 700)).isGreaterThan(299);

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
        assertThat(math.mulTest01(3, 4)).isEqualTo(12);
        assertThat(math.mulTest01(27, 19)).isEqualTo(513);
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
        assertThat(math.divTest01(10, 5)).isEqualTo(2);
        assertThat(math.divTest01(7, 2)).isEqualTo(3);
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
        assertThat(math.compareTest01(2, 3)).isEqualTo(-1);
        assertThat(math.compareTest01(11, 11)).isEqualTo(1);
        assertThat(math.compareTest01(7, 99)).isEqualTo(-1);
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
        assertThat(math.exam120817(numbers)).isEqualTo(5.5);
        assertThat(math.exam120817(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})).isEqualTo(94.0);
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
    }

    @Test
    public void exam120820() throws Exception{
        MathExam math = new MathExam();

        assertThat(math.exam120820(41)).isEqualTo(1983);
        assertThat(math.exam120820(24)).isEqualTo(2000);

        Throwable exception = assertThrows(Exception.class, () -> math.exam120820(0));
        System.out.println(exception.toString());
        Throwable exception2 = assertThrows(Exception.class, () -> math.exam120820(121));
        System.out.println(exception2.toString());

    }

    @Test
    public void exam120829() throws Exception {
        MathExam math = new MathExam();

        assertThat(math.exam120829(70)).isEqualTo(1);
        assertThat(math.exam120829(91)).isEqualTo(3);
        assertThat(math.exam120829(140)).isEqualTo(4);

        Throwable exception = assertThrows(Exception.class, () -> math.exam120829(0));
        System.out.println(exception.toString());
    }
}