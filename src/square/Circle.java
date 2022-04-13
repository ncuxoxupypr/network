package square;

public class Circle implements GeoFigure {

    private double radius;
    private final double COUNT_P = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void countArea() {
        double count = (Math.pow(radius, 2)) * COUNT_P;
        System.out.println("Площадь круга = " + count);
    }
}
