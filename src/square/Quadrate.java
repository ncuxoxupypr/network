package square;

public class Quadrate implements GeoFigure {
    private double sideQuadrate;

    public void setSideQuadrate(double sideQuadrate) {
        this.sideQuadrate = sideQuadrate;
    }
    @Override
    public void countArea() {
    double count = Math.pow(sideQuadrate, 2);
        System.out.println("Площадь квадрата = " + count);
    }
}
