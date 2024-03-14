public class Car {
    Engine engine= new Engine(" aee");
    Engine engine2= new Engine();



    double weight = 1000;
    double maxSpeed = 100;
    int seatsNumber = 5;
    String carName = "toyota";


    // TODO: (Level 3) добавь у Engine метод toString(), который будет возвращать строку из всех своих параметров через запятую
    public void talk() {
        System.out.println("car model:" + carName + ", engine info ={" + engine + "}, weight:" + weight +", max speed:"
        + maxSpeed);
    }

}

