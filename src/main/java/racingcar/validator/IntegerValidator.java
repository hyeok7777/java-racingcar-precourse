package racingcar.validator;

public class IntegerValidator {
    public int validateTryTimes(String tmpTryTimes) {
        int tryTimes = Integer.parseInt(tmpTryTimes);
        return tryTimes;
    }
}
