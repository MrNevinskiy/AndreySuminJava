package part2.hw9;

public class Man {
    private String name;
    private String jobTitle;
    private int age;
    private double growth;

    /* Пример текста для парсинга
    * "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист."
    */

    public Man(String man) {
        this.name = man.substring(4,8);
        this.jobTitle = man.substring(54,65);
        this.age = Integer.parseInt(man.substring(14,16));
        this.growth = Double.parseDouble(man.substring(32,37));

    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public double getGrowth() {
        return growth;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                '}';
    }
}
