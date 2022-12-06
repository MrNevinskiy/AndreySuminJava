package part2.hw13;

public class Driver extends Employee implements Drivable {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void driving() {
        System.out.println("Водить");
    }


}
