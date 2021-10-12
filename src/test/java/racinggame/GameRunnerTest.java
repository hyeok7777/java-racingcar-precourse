package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameRunnerTest {

    @Test
    void 우승자_출력() {
        Car car1 = new Car("pobi", 10);
        Car car2 = new Car("crong", 20);
        Car car3 = new Car("honux", 30);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        GameRunner gameRunner = new GameRunner();
        Assertions.assertThat(gameRunner.printSingleWinner(carList)).isEqualTo("honux");
    }

    @Test void 공동_우승() {
        Car car1 = new Car("pobi", 10);
        Car car2 = new Car("crong", 30);
        Car car3 = new Car("honux", 30);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        GameRunner gameRunner = new GameRunner();

        Assertions.assertThat(gameRunner.printManyWinners(carList)).isEqualTo("crong,honux");
    }
}