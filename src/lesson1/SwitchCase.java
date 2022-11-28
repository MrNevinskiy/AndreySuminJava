package lesson1;

public class SwitchCase {
    public static void main(String[] args) {
        int numberOfMounts = 14;

        switch (numberOfMounts){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
                /*
                *  итд
                * */
            default:
                System.out.println("Такого месяца нет");
                break;
        }
    }
}
