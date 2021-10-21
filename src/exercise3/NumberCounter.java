package exercise3;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int positive = 0, negative = 0;
        double sum = 0;

        while (number != 0) {
            if (number < 0) {
                negative++;
            } else if (number > 0) {
                positive++;
            } else {
                break;
            }
            sum += number;
            number = input.nextInt();
        }

        double average = sum / (positive + negative);

        System.out.println("Positive numbers: " + positive + "\nNegative Numbers: " + negative
                + "\nSum: " + sum + "\nAverage: " + average);
    }
}
