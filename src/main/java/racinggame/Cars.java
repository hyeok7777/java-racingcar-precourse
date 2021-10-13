package racinggame;

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
            System.out.println("최종 우승자는 " + winner.getName() + " 입니다.");
            return;
        }
        Name winners = printMultipleWinners();
        System.out.println("최종 우승자는 " + winners.getName() + " 입니다.");

    }

    // test private -> public
    private Name printSingleWinner() {
        return cars.get(0).getCarName();
    }

    private Name printMultipleWinners() {
        Set carSet = new HashSet<>();
        Name winners = cars.get(0).getCarName();
        for (int i = 1; i < cars.size() - (carSet.size() - 1); i++) {
            winners.setMultipleName(cars.get(i).getCarName().getName());
        }
        return winners;
    }

    private boolean isWinnerSingle() {
        for (int i = 0; i < cars.size(); i++) {
            Car setCar = cars.get(i);
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
