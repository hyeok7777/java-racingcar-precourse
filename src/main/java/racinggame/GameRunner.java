package racinggame;

import nextstep.utils.Randoms;

import java.util.*;

public class GameRunner {

    private StringRecognizer stringRecognizer;
    private Set carSet;
    private List<Car> listCars;

    public GameRunner() {
        carSet = new HashSet<>();
        listCars = new ArrayList<>();
        stringRecognizer = new StringRecognizer();
    }

    public void startGame() {

        stringRecognizer = new StringRecognizer();
        stringRecognizer.racingReader();

        for (int i = 0; i < stringRecognizer.getCarNames().length; i++) {
            Car car = new Car(stringRecognizer.getCarNames()[i], 0);
            listCars.add(car);
        }

        runGame(listCars);
    }

    private void runGame(List<Car> listCars) {
        System.out.println("실행 결과");
        for (int i = 0; i < stringRecognizer.getTryTimes(); i++) {
            carFunction(listCars);
        }
        Collections.sort(listCars);

        if (isWinnerSingle(listCars)) {
            String winner = printSingleWinner(listCars);
            System.out.println("최종 우승자는 " + winner + " 입니다.");
            return;
        }

        String winners = printManyWinners(listCars);
        System.out.println("최종 우승자는 " + winners + " 입니다.");

    }

    private Integer getForward() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= 4) {
            return 1;
        }
        return 0;
    }

    private void carFunction(List<Car> listCars) {
        for (int i = 0; i < listCars.size(); i++) {
            Car car = listCars.get(i);
            int currentSpeed = getForward();
            int currentPosition = car.getCurrentPosition();
            car.setCurrentPosition(currentPosition + currentSpeed);
            car.printCar();

        }
        System.out.println();
    }

    // test private -> public
    public String printSingleWinner(List<Car> listCars) {
        return listCars.get(0).getCarName();
    }

    public String printManyWinners(List<Car> listCars) {
        String winners = listCars.get(0).getCarName();
        for (int i = 1; i < listCars.size() - (carSet.size() - 1); i++) {
            winners += "," + listCars.get(i).getCarName();
        }
        return winners;
    }

    private boolean isWinnerSingle(List<Car> listCars) {
        for (int i = 0; i < listCars.size(); i++) {
            Car setCar = listCars.get(i);
            carSet.add(setCar.getCurrentPosition());
        }

        if (carSet.size() < listCars.size()) {
            return false;
        }
        return true;
    }


}
