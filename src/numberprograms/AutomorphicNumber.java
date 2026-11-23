/*
 * =====================================================================
 * Problem Statement: Write a Java program to check whether a given integer 
 * is an Automorphic Number. (An Automorphic Number is a number whose square 
 * ends with the exact same digits as the number itself.)
 * 
 * Example:
 * Input: num = 25
 * Output: true
 * Explanation: 25^2 = 625, which ends with 25.
 * =====================================================================
 */

package numberprograms;

public class AutomorphicNumber {

	public static void main(String[] args) {
        int num = 25;

        AutomorphicNumber obj = new AutomorphicNumber();
        boolean result = obj.isAutomorphic(num);

        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }
	
	public boolean isAutomorphic(int num) {
        if (num < 0) {
            return false; // Automorphic numbers are non-negative integers
        }

        long square = (long) num * num;

        while (num > 0) {
            if (num % 10 != square % 10) {
                return false; // Last digits do not match
            }
            num /= 10;
            square /= 10;
        }

        return true;
    }
}
