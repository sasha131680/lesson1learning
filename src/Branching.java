public class Branching {
    public static void main(String[] args) {
        int age = 19;
        String a=" ";
        System.out.println(a);
        System.out.println();
        boolean isOlder = age < 18;
        if (isOlder) {
            System.out.println(isOlder);
            System.out.println("Ты еще ребенок");
            System.out.println("Не спорь со взрослыми");
        } else {
            System.out.println(isOlder);
        }
    }
}
