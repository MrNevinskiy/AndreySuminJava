package part2.hw6_7.box;

public class Box {
    private double length;
    private double height;
    private double width;

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box(Box box1, Box box2) {
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
        this.width = box1.width + box2.width;
    }

    public Box increase(Box box) {
        Box newBox = new Box(this.length + box.length,
                this.height + box.height, this.width + box.width);
        return newBox;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
