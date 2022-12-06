package part2.hw14;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(11, new Counter() {
            @Override
            public String report(int mounts) {
                return "Отчет за " + mounts + " месяцев";
            }
        });

        MyCounter myCounter = new MyCounter();
        director.force(12,myCounter);
    }
}
