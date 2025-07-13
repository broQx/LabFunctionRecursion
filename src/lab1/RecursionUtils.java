package lab1;

public class RecursionUtils {

    // Problem 1: Find minimum in array
    // Time Complexity: O(n)
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    // Problem 2: Calculate average of array
    // Time Complexity: O(n)
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return (arr[n - 1] + (n - 1) * findAverage(arr, n - 1)) / (double) n;
    }

    // Problem 3: Check if number is prime
    // Time Complexity: O(√n)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    // Problem 4: Calculate factorial
    // Time Complexity: O(n)
    public static long factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    // Problem 5: Calculate nth Fibonacci number
    // Time Complexity: O(2^n)
    public static int fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Problem 6: Compute power (a^n)
    // Time Complexity: O(log n)
    public static long power(int a, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            long half = power(a, n / 2);
            return half * half;
        }
        return a * power(a, n - 1);
    }

    // Problem 7: Print array in reverse order
    // Time Complexity: O(n)
    public static void reversePrint(int[] arr, int idx) {
        if (idx < 0) return;
        System.out.print(arr[idx] + " ");
        reversePrint(arr, idx - 1);
    }

    // Problem 8: Check if string has all digits
    // Time Complexity: O(n)
    public static boolean isAllDigits(String s, int idx) {
        if (idx == s.length()) return true;
        if (!Character.isDigit(s.charAt(idx))) return false;
        return isAllDigits(s, idx + 1);
    }

    // Problem 9: Compute binomial coefficient C(n, k)
    // Time Complexity: O(2^n)
    public static long binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    // Problem 10: Compute GCD
    // Time Complexity: O(log(min(a, b)))
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}