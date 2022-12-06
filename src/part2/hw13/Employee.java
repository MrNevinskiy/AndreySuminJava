package part2.hw13;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void voice(){
        System.out.println(getName());
    }

    public String getName() {
        return name;
    }
}
