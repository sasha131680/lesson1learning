public class Engine {
    // TODO: Добавь поле с состоянием двигателя - включен ли он на данный момент или нет
    int cylinders = 4;
    double weight = 90;
    String model = "1cd-ftv";
    // TODO: Добавь конструктор, с помощью которого можно будет создать двигатель со своими параметрами массы, модели и цилиндров
    public Engine(String model){
        this.model=model;

    }
    public Engine(){

    }

    public String toString() {
        return model + "," + cylinders + "," + weight;
    }

}
