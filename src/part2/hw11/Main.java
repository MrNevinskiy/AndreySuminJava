package part2.hw11;

public class Main {
    public static void main(String[] args) {
        BoxWeight boxWeight1 = new BoxWeight();
        boxWeight1.showInfo();

        BoxWeight boxWeight2 = new BoxWeight(10,24,44,10);
        boxWeight2.showInfo();
    }
}
