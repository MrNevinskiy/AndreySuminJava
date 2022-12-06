package part2.hw11;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight() {
        super();
        this.weight = 2.22;
    }

    public BoxWeight(double length, double height, double width, double wight) {
        super(length, height, width);
        this.weight = wight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
    }
}
