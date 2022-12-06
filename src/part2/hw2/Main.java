package part2.hw2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.speed = 10;
        dog1.name = "Bob";
        dog1.breed = "Ovcharka";

        dog1.run();
        System.out.println(dog1.info());

        dog2.speed = 5;
        dog2.name = "Huka";
        dog2.breed = "Dvorterier";

        dog2.run();
        System.out.println(dog2.info());
    }

}
