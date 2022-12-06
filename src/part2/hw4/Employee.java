package part2.hw4;

public class Employee {
    String name;
    String jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    String info(int mounts){
        return "Name: "+name +"\nJobTitle:" +jobTitle +"\nSalary by " + mounts + " :"+ salary * mounts;
    }
}
