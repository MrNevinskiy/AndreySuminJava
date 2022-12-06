package part3.hw3;

public class Main {
    private static Boolean isCorrect = false;

    private static int magicNumber;

    public static void main(String[] args) {

        Thread generateNumber = new Thread(new Runnable() {
            @Override
            public void run() {
                magicNumber = (int) (Math.random() * 1000000000);
            }
        });

        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isCorrect) {
                    int number = (int) (Math.random() * 1000000000);
                    if (number == magicNumber) {
                        isCorrect = true;
                        System.out.println(magicNumber);
                        System.out.println(number);
                    }
                }
            }
        });

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!isCorrect) {
                    try {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        timer.start();
        generateNumber.start();
        player.start();

    }
}
