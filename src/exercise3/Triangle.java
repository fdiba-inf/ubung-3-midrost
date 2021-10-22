package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c;

        do {
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                double perimeter_half = (a + b + c) / 2;
                double area = Math.sqrt(perimeter_half * (perimeter_half - a) * (perimeter_half - b) * (perimeter_half - c));
                System.out.println("Area: " + area);
                if (a == b && b == c) {
                    System.out.println("Triangle: equilateral");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Triangle: isosceles");
                } else {
                    System.out.println("Triangle: scalene");
                }
            } else {
                System.out.println("Values are not correct!");
            }
        } while (a > 0 && b > 0 && c > 0);
    }
}
