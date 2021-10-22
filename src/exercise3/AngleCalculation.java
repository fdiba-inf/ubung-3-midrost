package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do {
            double angle_input = input.nextDouble();
            char angle_type = input.next().charAt(0);

            if (angle_type == 'r') {
                double angle_deg = angle_input * 180f / Math.PI;
                System.out.println("Angle: " + angle_deg + "d");
            } else if (angle_type == 'd') {
                double angle_rad = angle_input * Math.PI / 180f;
                System.out.println("Angle: " + angle_rad + "r");
            } else {
                flag = false;
            }
        } while (flag);
    }
}
