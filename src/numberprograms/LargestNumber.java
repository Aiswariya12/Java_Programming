/*
 * =====================================================================
 * Problem Statement: Write a Java program to find the largest among 
 * three given numbers.
 * 
 * Example:
 * Input: a = 15, b = 42, c = 27
 * Output: 42 is the Largest Number
 * =====================================================================
 */

package numberprograms;

public class LargestNumber {
	
	public static void main(String[] args) {
		int a = 15;
        int b = 42;
        int c = 27;

        LargestNumber obj = new LargestNumber();
        int largest = obj.findLargest(a, b, c);

        System.out.println("Inputs: " + a + ", " + b + ", " + c);
        System.out.println("Output: " + largest + " is the Largest Number");
	}

	public int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
