package exercise3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean prime = true;
        int i = 2;

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (i < number) {
            if (number % i == 0) {
                prime = false;
                break;
            }
            i++;
        }
        System.out.println("Prime number: " + prime);
    }
}
