public class Phone {
    String number;
    String model;
    int weight;
    String color;


    public Phone(String number, String model, int weight, String color) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.color = color;

    }

    public String toString() {
        return "Number: " + number + ", Model: " + model + ", Weight: " + weight + ", color: " + color;
    }

    public void paint(){
        color="red";

    }

    public void repaint(String newColor){
        color=newColor;

    }
}
