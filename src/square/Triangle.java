package square;

public class Triangle implements GeoFigure {
    private double sideTriangleOne;
    private double sideTriangleTwo;
    private double sideTriangleThree;

    public void setSideTriangleOne(double sideTriangleOne) {
        this.sideTriangleOne = sideTriangleOne;
    }

    public void setSideTriangleTwo(double sideTriangleTwo) {
        this.sideTriangleTwo = sideTriangleTwo;
    }

    public void setSideTriangleThree(double sideTriangleThree) {
        this.sideTriangleThree = sideTriangleThree;
    }
    @Override
    public void countArea() {
        double count = (sideTriangleOne + sideTriangleTwo + sideTriangleThree) / 2;
        System.out.println("Площадь треугольника = " + count);
    }
}
