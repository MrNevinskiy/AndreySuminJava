package part2.hw13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cook cook1 = new Cook("Вова");
        Cook cook2 = new Cook("Петя");
        Cook cook3 = new Cook("Леха");

        ArrayList<Cook> cooks = new ArrayList<>();
        cooks.add(cook1);
        cooks.add(cook2);
        cooks.add(cook3);

        Developer developer1 = new Developer("Вова");
        Developer developer2 = new Developer("Петя");
        Developer developer3 = new Developer("Леха");

        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);

        Driver driving1 = new Driver("Вова");
        Driver driving2 = new Driver("Петя");
        Driver driving3 = new Driver("Леха");

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(driving1);
        drivers.add(driving2);
        drivers.add(driving3);

        for (Cook cook : cooks) {
            cook.voice();
            cook.cooking();
        }

        for (Developer developer : developers) {
            developer.voice();
            developer.programming();
        }

        for (Driver driver : drivers) {
            driver.voice();
            driver.driving();
        }

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);
        employees.add(developer1);
        employees.add(developer2);
        employees.add(developer3);
        employees.add(driving1);
        employees.add(driving2);
        employees.add(driving3);
        for (Employee employee : employees) {
            employee.voice();
        }
    }
}
