package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void 자동차_정보_출력() {
        Car car = new Car("아반떼", 5);

        Assertions.assertThat(car.getCarName()).isEqualTo("아반떼");
        Assertions.assertThat(car.getCurrentPosition()).isEqualTo(5);
    }
}