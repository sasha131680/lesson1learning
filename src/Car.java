public class Car {
    // TODO: убери engine2, а первый engine создавай с кастомными параметрами массы, модели и цилиндров (а не только модель)
    Engine engine= new Engine(" aee");
    Engine engine2= new Engine();



    double weight = 1000;
    double maxSpeed = 100;
    int seatsNumber = 5;
    String carName = "toyota";

    // TODO: переименуй метод talk() в toString(), а также сделай чтобы вместо вывода информации на экран,
    //  он просто возвращал строку с этой информацией
    void talk() {
        System.out.println("car model:" + carName + ", engine info ={" + engine + "}, weight:" + weight +", max speed:"
        + maxSpeed);
    }
    // TODO: реализуй метод calculateFuelConsumption(), который будет рассчитывать потребление топлива автомобилем по формуле:
    //  consumption = distance * cylinders * 0.01
    double calculateFuelConsumption(double distance){
        return 0.0;
    }

    // TODO: реазилуй метод enableEngine(), который будет включать двигатель
    // TODO: реазилуй метод disableEngine(), который будет выключать двигатель

}

