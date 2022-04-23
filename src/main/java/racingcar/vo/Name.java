package racingcar.vo;

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSingleName(String name) {
        this.name = name;
    }

    public void setMultipleName(String name) {
        this.name += ", "+name;
    }
}