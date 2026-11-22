/*
 * =====================================================================
 * Problem Statement: Write a Java program to check whether a given integer 
 * is a Prime Number. (A prime number is a natural number greater than 1 
 * that has no positive divisors other than 1 and itself.)
 * 
 * Example:
 * Input: num = 29
 * Output: true
 * Explanation: 29 has no divisors other than 1 and 29.
 * =====================================================================
 */

package numberprograms;

public class PrimeNumber {
	public static void main(String[] args) {
        int num = 29;

        PrimeNumber obj = new PrimeNumber();
        boolean result = obj.isPrime(num);

        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }

	public boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers <= 1 are not prime
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a divisor other than 1 and itself
            }
        }

        return true;
    }

}
