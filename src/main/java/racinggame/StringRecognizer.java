package racinggame;

import nextstep.utils.Console;

public class StringRecognizer {
    public String[] getStringSplit(String consoleString) {
        String[] tempStrList = consoleString.split(",");

        if(isWrongName(tempStrList)) {
            System.out.println("자동차 이름은 5글자 이하여야합니다.");
            String newConsoleString = getNewString();
            getStringSplit(newConsoleString);
        }

        return tempStrList;
    }
    // TEST를 위한 public 선언
    public boolean isWrongName(String[] tempStrList) {
        for (String str: tempStrList) {
            if(str.length() > 6) {
                return false;
            }
        }
        return true;
    }

    private String getNewString() {
        System.out.println("경주할 자동차 이름을 다시 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String newConsoleString = Console.readLine();
        return newConsoleString;
    }

    public Integer getTryTimes(String tryTimes) {
        return Integer.parseInt(tryTimes);
    }
}
