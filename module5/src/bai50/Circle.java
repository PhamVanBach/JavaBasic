package bai50;

public class Circle {

    // Khai báo biến
    private double radius;
    private final double PI = Math.PI;
    // Constructor
    public Circle(){
        radius = 0.0;
    };

    public Circle(double numRadius) {
        // Nếu bán kính < 0
        if (numRadius < 0)
            radius = 0;
        // ngược lại
        else
            radius = numRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        // S ht = r*pi*pi
        return radius*Math.pow(PI,2);
    }

    @Override
    public String toString() {
        return "\nCircle {" +
                "radius=" + radius +
                ", Area=" + getArea() +
                '}';
    }
}
