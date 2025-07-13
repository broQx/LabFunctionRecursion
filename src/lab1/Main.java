package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Minimum: " + RecursionUtils.findMin(arr, n));
        System.out.println("Average: " + RecursionUtils.findAverage(arr, n));

        System.out.print("Enter number to check prime: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println("Is prime? " + RecursionUtils.isPrime(num));
        } else {
            System.out.println("Invalid input for prime check.");
            scanner.next();
        }

        System.out.print("Enter number for factorial: ");
        int fact = scanner.nextInt();
        System.out.println("Factorial: " + RecursionUtils.factorial(fact));

        System.out.print("Enter number for Fibonacci: ");
        int fib = scanner.nextInt();
        System.out.println("Fibonacci: " + RecursionUtils.fibonacci(fib));

        System.out.print("Enter base and exponent: ");
        int base = scanner.nextInt();
        int exp = scanner.nextInt();
        System.out.println("Power: " + RecursionUtils.power(base, exp));

        System.out.print("Array in reverse: ");
        RecursionUtils.reversePrint(arr, n - 1);
        System.out.println();

        System.out.print("Enter a string: ");
        String s = scanner.next();
        System.out.println("All digits? " + RecursionUtils.isAllDigits(s, 0));

        System.out.print("Enter n and k for binomial coefficient: ");
        int bn = scanner.nextInt();
        int bk = scanner.nextInt();
        System.out.println("Binomial Coefficient: " + RecursionUtils.binomial(bn, bk));

        System.out.print("Enter two numbers for GCD: ");
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        System.out.println("GCD: " + RecursionUtils.gcd(g1, g2));
    }
}