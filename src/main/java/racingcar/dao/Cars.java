package racingcar.dao;


import racingcar.vo.Car;
import racingcar.vo.Name;
import racingcar.vo.Position;
import racingcar.vo.Speed;

import java.util.*;

public class Cars {
    private List<Car> cars;
    private Set<Position> carSet;

    public Cars() {
        cars = new ArrayList<>();
        carSet = new HashSet<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void printWinners() {
        Collections.sort(cars);

        if (isWinnerSingle()) {
            Name winner = printSingleWinner();
            System.out.println("최종 우승자: " + winner.getName());
            return;
        }
        Name winners = printMultipleWinners();
        System.out.println("최종 우승자: " + winners.getName());

    }

    // test private -> public
    private Name printSingleWinner() {
        return cars.get(0).getCarName();
    }

    private Name printMultipleWinners() {
        System.out.println("printMultipleWinners() = ");
        Set carSet = new HashSet<>();
        Name winners = cars.get(0).getCarName();
        System.out.println("winners = " + winners);
        for (int i = 1; i < cars.size() - (carSet.size() - 1); i++) {
            winners.setMultipleName(cars.get(i).getCarName().getName());
        }
        return winners;
    }

    private boolean isWinnerSingle() {
        System.out.println("isWinnerSingle() = ");
        for (int i = 0; i < cars.size(); i++) {
            Car setCar = cars.get(i);
            System.out.println("setCar.getCurrentPosition().getPosition() = " + setCar.getCurrentPosition().getPosition());
            carSet.add(setCar.getCurrentPosition());
        }
        if (carSet.size() < cars.size()) {
            return false;
        }
        return true;
    }

    public void carFunction() {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            Speed currentSpeed = new Speed();
            car.getCurrentPosition().addCurrentSpeed(currentSpeed.getForward());
            car.printCar();
        }
        System.out.println();
    }

    public void add(Car car) {
        cars.add(car);
    }
}
