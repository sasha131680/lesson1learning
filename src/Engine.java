public class Engine {

    int cylinders = 4;
    double weight = 90;
    String model = "1cd-ftv";
    public Engine(String model){
        this.model=model;

    }
    public Engine(){

    }

    public String toString() {
        return model + "," + cylinders + "," + weight;
    }

}
