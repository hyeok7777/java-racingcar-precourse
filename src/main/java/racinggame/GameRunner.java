package racinggame;

public class GameRunner {

    private StringRecognizer stringRecognizer;
    private Cars listCars;

    public GameRunner() {
        listCars = new Cars();
        stringRecognizer = new StringRecognizer();
    }

    public void startGame() {
        stringRecognizer.racingReader();

        for (int i = 0; i < stringRecognizer.getCarNames().length; i++) {
            Position position = new Position();
            position.setStartPosition();
            Name name = new Name(stringRecognizer.getCarNames()[i]);
            Car car = new Car(name, position);
            listCars.add(car);
        }
        runGame(listCars);
    }

    private void runGame(Cars listCars) {
        System.out.println("실행 결과");
        for (int i = 0; i < stringRecognizer.getTryTimes(); i++) {
            listCars.carFunction();
        }

        listCars.printWinners();
    }


}
