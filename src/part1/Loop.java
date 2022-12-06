package part1;

public class Loop {
    public static void main(Strings[] args) {
        int i = 100;
        int sum = 0;
        while (i >= 1) {
            sum += i;
            i--;
        }
        sum /= 100;
        System.out.println(sum);

        int a = 0;
        do {
            System.out.println("Hi");
        } while (a > 0);

        for (int j = 0; j <= 100; j++) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }

        for (int k = 100; k <= 1000; k++){
            if(k%5==0){
                System.out.println(k);
            }
        }

    }
}
