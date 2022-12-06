package part2.hw3;

public class Rect {
    double length;
    double width;

    void volume(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    double area() {
        return length * width;
    }
}
