package Java;

import java.io.IOException;

import java.util.Scanner;

public class tesst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Read the number of queries

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            generateSeries(a, b, n);
        }

        scanner.close();
    }

    private static void generateSeries(int a, int b, int n) {
        int sum = a;

        for (int i = 0; i < n; i++) {
//            sum += b * (1 << i); // 1 << i is equivalent to 2^i
            sum += b * Math.pow(2, i);
            System.out.print(sum + " ");
        }
        System.out.println(); // Move to the next line after printing the series
    }
}
