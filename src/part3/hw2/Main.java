package part3.hw2;

public class Main {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 90 + 10);
        String info = String.format("Случайное чило %s. \nПопробуйте еще раз", rand);
        System.out.println(info);
    }
}
