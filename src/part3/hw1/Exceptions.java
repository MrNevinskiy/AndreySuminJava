package part3.hw1;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[11];
            for (int i = 0; i < numbers.length + 1; i++) {
                numbers[i] = i;
            }
            for (int number: numbers){
                System.out.println(number);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Мы вышли за приделы массива");
        }
    }
}
