package part2.hw13;

public class Cook extends Employee implements Cookable {
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cooking() {
        System.out.println("Готовить");
    }
}
