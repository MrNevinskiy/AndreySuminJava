package part2.hw11;

public class Box {
    private double length;
    private double height;
    private double width;

    public Box() {
        this.length = 1;
        this.height = 1;
        this.width = 1;
    }

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void showInfo() {
        System.out.println("Box{" +
                "length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}');
    }
}