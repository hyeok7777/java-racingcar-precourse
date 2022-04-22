package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringRecognizerTest {
    @Test
    void 스트링_인풋_스플릿() {
        String str = "pobi,crong,honux";
        StringRecognizer stringRecognizer = new StringRecognizer();
        String[] splitStr = stringRecognizer.getStringSplit(str);
        String[] testStr = {"pobi", "crong", "honux"};

        Assertions.assertThat(splitStr).isEqualTo(testStr);
    }

    @Test
    void 시도할_횟수_입력_자동차_생성() {
        String tryTimes = "5";
        StringRecognizer stringRecognizer = new StringRecognizer();
        int times = stringRecognizer.getTryTimes(tryTimes);

        Assertions.assertThat(times).isEqualTo(5);
    }
}