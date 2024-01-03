public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("1", "iphone", 100, "black");
        Phone phone2 = new Phone("2", "samsung", 200, "white");

        System.out.println(phone.toString());
        System.out.println(phone2.toString());
        phone.paint();
        phone2.paint();
        System.out.println("painting the phones");
        System.out.println(phone.toString());
        System.out.println(phone2.toString());
        phone.repaint("dark");
        System.out.println(phone.toString());

        Person person1=new Person("Pete",20 );
        person1.move();
        person1.talk();
        Person person2=new Person();
        person2.talk();
    }
}