package student;

public class RectangleInterface implements ShapeInterface {
	private double length;
    private double width;

    public RectangleInterface(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
