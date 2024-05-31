/*
package com.imp;


public class ArmstsrongNumberExample {

	public static void main(String[] args) {
		
	}

}
*/





























/*
package com.imp;
import java.util.Scanner;

public class ArmstsrongNumberExample {
    // Function to check if the number is Armstrong or not
    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return n == sum;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.print("Armstrong");
        } else {
            System.out.print("Not Armstrong");
        }
    }
}

 
 */















package com.imp;
import java.util.Scanner;

public class ArmstsrongNumberExample {
    // Function to check if the number is Armstrong or not
    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
		int numDigits = 0;
		int tempNum = n;
// Count the number of digits in the number
	while (tempNum != 0) {
    tempNum /= 10;
    numDigits++;
	}

	tempNum = n;
	int sum2 = 0;
	// Calculate the sum of powers of digits
	while (tempNum != 0) {
	    int digit = tempNum % 10;
	    sum2 += Math.pow(digit, numDigits);
	    tempNum /= 10;
	}

    return n == sum2;
}
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int num = sc.nextInt();
	        
	        if (isArmstrong(num)) {
	            System.out.print("Armstrong");
	        } else {
	            System.out.print("Not Armstrong");
	        }
	    }
	}

 