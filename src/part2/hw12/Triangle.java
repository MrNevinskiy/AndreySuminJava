package part2.hw12;

public class Triangle extends Figure {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double size) {
        super(size, size);
        this.c = size;
    }

    @Override
    public double area() {
        double p = 0.5*(getA() + getB() + c);
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-c));
    }
}
