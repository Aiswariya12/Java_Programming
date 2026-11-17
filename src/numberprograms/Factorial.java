/*
 * =====================================================================
 * Problem Statement: Write a Java program to find the factorial of a 
 * given non-negative integer.
 * 
 * Example:
 * Input: n = 5
 * Output: 120 (5 * 4 * 3 * 2 * 1 = 120)
 * =====================================================================
 */

package numberprograms;

public class Factorial {
	
	public static void main(String[] args) {
		int n = 5;

        Factorial obj = new Factorial();
        long result = obj.calculateFactorial(n);

        System.out.println("Input: " + n);
        if (result == -1) {
            System.out.println("Output: Invalid input (negative number)");
        } else {
            System.out.println("Output: Factorial of " + n + " is " + result);
            }
	}
	
	private long calculateFactorial(int n) {
		
		 if (n < 0) {
             return -1; 
         }
         
         long fact = 1;
         for (int i = 1; i <= n; i++) {
             fact *= i;
	    }
		 return fact;
	}
}
