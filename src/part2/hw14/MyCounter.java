package part2.hw14;

public class MyCounter implements Counter {
    @Override
    public String report(int mounts) {
        return "Отчет за " + mounts + " месяцев";
    }
}
