package part1;

public class SecondCalc {
    public static void main(Strings... args) {
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDay = secondsInHours * 24;

        int seconds = 8000000;

        int days = seconds / secondsInDay;
        int hours = (seconds % secondsInDay) / secondsInHours;
        int minutes = ((seconds % secondsInDay) % secondsInHours) / secondsInMinutes;
        int lastSecond = seconds - days * 86400 - hours * 3600 - minutes * 60;

        System.out.println
                ("Всего секнд = " + seconds + " Дней: " + days + " Часов: " + hours + " Минут: " + minutes + " Секнд: " + lastSecond);
    }
}