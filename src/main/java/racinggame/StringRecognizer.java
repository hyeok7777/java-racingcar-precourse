package racinggame;

import nextstep.utils.Console;

import java.util.NoSuchElementException;

public class StringRecognizer {

    private String consoleReadline;
    private Integer tryTimes;
    private String[] carNames;

    public Integer getTryTimes() {
        return tryTimes;
    }

    public String[] getCarNames() {
        return carNames;
    }

    public void racingReader() {
        readStringNames();
        carNames = stringSplit(consoleReadline);
        tryTimes = readTryTimes();
    }

    private String readStringNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        consoleReadline = Console.readLine();
        return consoleReadline;
    }

    // TEST를 위한 public 선언
    public Integer readTryTimes() {
        System.out.println("시도할 회수는 몇회인가요?");
        String strTryTimes = Console.readLine();
        return Integer.parseInt(strTryTimes);
    }

    public String[] stringSplit(String consoleString) {
        String[] tempStrList = consoleString.split(",");

        if(!isWrongName(tempStrList)) {
            System.out.println("[ERROR] 자동차 이름은 5글자 이내여야 합니다. ");
            racingReader();
        }

        if(!isInputNotNull(consoleString)) {
            System.out.println("[ERROR] 자동차 이름은 5글자 이내여야 합니다. ");
            racingReader();
        }

        return tempStrList;
    }

    private boolean isInputNotNull(String consoleReadline) {
        if (consoleReadline.length() == 0) {
            return false;
        }
        return true;
    }

    private boolean isWrongName(String[] tempStrList) {
        for (String str: tempStrList) {
            if(str.length() > 5) {
                return false;
            }
        }
        return true;
    }

}
