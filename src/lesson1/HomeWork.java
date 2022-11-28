package lesson1;

public class HomeWork {
    public static void main(String[] args) {
        String[] mounts = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Авгувст", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        String[] seasons = {
                "Весна", "Лето", "Осень", "Зима"};

        String mount = "Март";
        String error = "Данного месяца не существует";


        if (mount.equals(mounts[11]) || mount.equals(mounts[0]) || mount.equals(mounts[1])) {
            System.out.println(seasons[3]);
        } else if (mount.equals(mounts[2]) || mount.equals(mounts[3]) || mount.equals(mounts[4])) {
            System.out.println(seasons[0]);

        } else if (mount.equals(mounts[5]) || mount.equals(mounts[6]) || mount.equals(mounts[7])) {
            System.out.println(seasons[1]);
        } else if (mount.equals(mounts[8]) || mount.equals(mounts[9]) || mount.equals(mounts[10])) {
            System.out.println(seasons[2]);
        } else {
            System.out.println(error);
        }

        switch (mount) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println((seasons[3]));
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println((seasons[0]));
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println((seasons[1]));
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println((seasons[2]));
                break;
            default:
                System.out.println(error);
                break;

        }
    }
}
