public class Person {
    String fullname;
    int age;

    public void move() {
        System.out.println("i was born");
    }

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;

    }

    public void talk() {
        System.out.println(fullname + " says hello");
    }

    public Person(){
        fullname="noname";
        age=0;

    }
}
