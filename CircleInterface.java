package student;

public class CircleInterface implements ShapeInterface{
	private double radius;

    public CircleInterface(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
