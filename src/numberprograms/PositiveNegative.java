/*
 * =====================================================================
 * Problem Statement: Write a Java program to check whether a given number 
 * is positive, negative, or zero.
 * 
 * Example:
 * Input: -5
 * Output: Negative Number
 * =====================================================================
 */

package numberprograms;

public class PositiveNegative {
	
	public static void main(String[] args) {
		int num=-5;
		PositiveNegative obj= new PositiveNegative();
		String result=obj.checkNumber(num);
		
		System.out.println("Input: " + num);
        System.out.println("Output: " + result);
	}

   private String checkNumber(int number) {
	if (number > 0) {
		return "Positive Number";
	} else if (number < 0) {
		return "Negative Number";
	}
	else {
		return "Zero";
	  }
   }
}
