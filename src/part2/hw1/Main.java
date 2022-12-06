package part2.hw1;

public class Main {
    public static void main(String[] args) {
        People people1 = new People();
        people1.age = 22;
        people1.name = "Anton";
        people1.weight = 50;

        System.out.println(people1.toString());

        People people2 = new People();
        people2.age = 44;
        people2.name = "Bob";
        people2.weight = 55;

        System.out.println(people2.toString());

        People people3 = new People();
        people3.age = 32;
        people3.name = "Sergo";
        people3.weight = 70;

        System.out.println(people3.toString());

        double sum = (people1.age + people2.age + people3.age) / 3;
        System.out.println(sum);
    }
}
