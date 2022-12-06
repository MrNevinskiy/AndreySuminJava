package part1;

public class Strings {
    public static void main(String... args) {
        String[] mounts = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Авгувст", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String result = "";
        for (int i = 0; i < mounts.length; i++) {
            result += mounts[i];
            if (i != mounts.length - 1) {
                result += (", ");
            } else {
                result += (".");
            }
        }
        System.out.println(result);
    }
}
