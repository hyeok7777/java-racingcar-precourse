package racinggame;

public class Car implements Comparable<Car> {
    private String carName;
    private Integer currentPosition;

    public Car(String carName, Integer currentPosition) {
        this.carName = carName;
        this.currentPosition = currentPosition;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void printCar() {
        System.out.print(getCarName() + " : ");
        for (int i = 0; i < getCurrentPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public int compareTo(Car o) {
        if (this.currentPosition > o.getCurrentPosition()) {
            return -1;
        }

        if (this.currentPosition < o.getCurrentPosition()) {
            return 1;
        }

        return 0;
    }
}
