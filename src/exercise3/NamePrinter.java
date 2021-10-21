package exercise3;

import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();

        char[] name_char = name.toCharArray();
        for (int i = 0; i < name_char.length; i++) {
            System.out.println("* " + name_char[i] + " *");
        }
    }
}
