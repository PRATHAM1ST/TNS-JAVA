package student;

public class TriangleInterface implements ShapeInterface{
	private double base;
    private double height;

    public TriangleInterface(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
