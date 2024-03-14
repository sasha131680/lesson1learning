public class Car {
    String engineName = "1cd";
    double weight = 1000;
    double maxSpeed = 100;
    int seatsNumber = 5;
    String carName = "toyota";

    // TODO: (Level 2) добавь вместо engineName класс Engine, в котором опиши количество цилиндров, массу двигателя и названия
    // TODO: (Level 3) добавь у Engine метод toString(), который будет возвращать строку из всех своих параметров через запятую
    public void talk() {
        System.out.println("car model:" + carName + ", engine name=" + engineName + ", weight:" + weight +", max speed:"
        + maxSpeed);
    }

}

