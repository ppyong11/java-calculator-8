package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculateTest extends NsTest {

    @Test
    void 커스텀_구분자랑_기본_구분자_혼합사용_예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("//~\n1,2,3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 커스텀_구분자_지정_예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("~\n1~2~3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

}
