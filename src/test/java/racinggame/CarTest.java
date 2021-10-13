package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void 자동차_정보_출력() {
        Name name = new Name("아반떼");
        Position position = new Position();
        position.setPosition(5);
        Car car = new Car(name, position);

        Assertions.assertThat(car.getCarName().getName()).isEqualTo("아반떼");
        Assertions.assertThat(car.getCurrentPosition().getPosition()).isEqualTo(5);
    }
}