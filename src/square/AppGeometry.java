package square;

import java.util.Scanner;

public class AppGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру, введите ее номер: \n1)Треугольник\n2)Квадрат\n3)Круг");
        int number = scanner.nextInt();

        if (number == 1) {
            Triangle triangle = new Triangle();
            System.out.println("Введите значение первой стороны треугольника: ");
            triangle.setSideTriangleOne(scanner.nextDouble());
            System.out.println("Введите значение второй стороны треугольника: ");
            triangle.setSideTriangleTwo(scanner.nextDouble());
            System.out.println("Введите значение третьей стороны треугольника: ");
            triangle.setSideTriangleThree(scanner.nextDouble());
            triangle.countArea();
        }
        if (number == 2) {
            Quadrate quadrate = new Quadrate();
            System.out.println("Введите значение стороны квадрата: ");
            quadrate.setSideQuadrate(scanner.nextDouble());
            quadrate.countArea();
        }
        if (number == 3) {
            Circle circle = new Circle();
            System.out.println("Введите радиус круга: ");
            circle.setRadius(scanner.nextDouble());
            circle.countArea();
        }
    }
}
