package AH3;
import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int n = scanner.nextInt();

        System.out.println("Iterative way of Fizz Buzz: ");
        fizzBuzzIt(n);
        System.out.println();
        System.out.println("Recursive way of Fizz Buzz: ");
        fizzBuzzRecursive(1, n);

    }

    public static void fizzBuzzIt(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }

        }
    }

    public static void fizzBuzzRecursive(int current, int n) {

        if (current > n) {
            return;
        }

        if (current % 3 == 0 && current % 5 == 0) {
            System.out.print("FizzBuzz ");
        } else if (current % 3 == 0) {
            System.out.print("Fizz ");
        } else if (current % 5 == 0) {
            System.out.print("Buzz ");
        } else {
            System.out.print(current + " ");
        }

        fizzBuzzRecursive(current + 1, n);

    }
}
