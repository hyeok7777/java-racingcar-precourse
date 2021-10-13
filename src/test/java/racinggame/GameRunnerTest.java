package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GameRunnerTest {

    @Test
    void 우승자_출력() {
        Name name1 = new Name("pobi");
        Position position1 = new Position();
        position1.setPosition(5);
        Name name2 = new Name("crong");
        Position position2 = new Position();
        position2.setPosition(10);
        Name name3 = new Name("honux");
        Position position3 = new Position();
        position3.setPosition(15);
        Car car1 = new Car(name1, position1);
        Car car2 = new Car(name2, position2);
        Car car3 = new Car(name3, position3);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        GameRunner gameRunner = new GameRunner();
        //Assertions.assertThat(gameRunner.printSingleWinner(carList)).isEqualTo("honux");
    }

    @Test void 공동_우승() {
        Name name1 = new Name("pobi");
        Position position1 = new Position();
        position1.setPosition(5);
        Name name2 = new Name("crong");
        Position position2 = new Position();
        position2.setPosition(15);
        Name name3 = new Name("honux");
        Position position3 = new Position();
        position3.setPosition(15);
        Car car1 = new Car(name1, position1);
        Car car2 = new Car(name2, position2);
        Car car3 = new Car(name3, position3);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        GameRunner gameRunner = new GameRunner();

        //Assertions.assertThat(gameRunner.printMultipleWinners(carList)).isEqualTo("crong,honux");
    }
}