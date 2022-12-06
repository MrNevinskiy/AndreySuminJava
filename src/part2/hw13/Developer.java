package part2.hw13;

public class Developer extends Employee implements CodeWritable {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void programming() {
        System.out.println("Программировать");
    }
}
