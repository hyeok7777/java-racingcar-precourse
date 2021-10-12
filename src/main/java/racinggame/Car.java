package racinggame;

import nextstep.utils.Randoms;

public class Car {
    private String carName;
    private Integer currentPosition;

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

    public Car(String carName, Integer currentPosition) {
        this.carName = carName;
        this.currentPosition = currentPosition;
    }

    public void printCar() {
        System.out.print(getCarName()+":");
        for (int i = 0; i < getCurrentPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
