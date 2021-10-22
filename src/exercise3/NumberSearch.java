package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 100; i < 1001; i++) {
            if (i % 6 == 0 && i % 5 == 0) {
                if (counter == 10) {
                    counter = 1;
                    System.out.print(i + "\n");
                } else {
                    System.out.print(i + " ");
                    counter++;
                }
            }
        }
    }
}
