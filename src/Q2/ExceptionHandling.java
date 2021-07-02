package Q2;

import java.util.Scanner;

/**
 * Created by İbrahim Başar YARGICI at 2.07.2021
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // I did not get how x = 23.323 and y = 0 are given at the same time and how program throws InputMismatchException.
            // To be mismatch, '.' should be problem and program should not get y.

            divide(x, y);
        } catch (Exception e) {
            System.out.println(e); // Input correctness is checked
        }
    }

    private static void divide(int x, int y) {
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println(e); // Arithmetic logic is checked
        }
    }
}