package racingcar;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public String process() {
        return ("-".repeat(position));
    }

    public void updatePosition() {
        position++;
    }

    public void printCarName() {
        View view = new View();
        view.print(name);
    }
}
