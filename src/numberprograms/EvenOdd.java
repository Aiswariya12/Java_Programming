/*
 * =====================================================================
 * Problem Statement: Write a Java program to check whether a given number is even or odd.
 * 
 * Example:
 * Input: 10
 * Output: Even Number
 * =====================================================================
 */

package numberprograms;

public class EvenOdd {
	
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 10;
        
        EvenOdd obj = new EvenOdd();
        
        System.out.println("--- Running Even/Odd Validation ---");
        if (obj.isEven(n)) {
            System.out.println(n + " is an Even Number");
        } else {
            System.out.println(n + " is an Odd Number");
        }
    }
}