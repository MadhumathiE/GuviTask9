package guvitask9;
import java.util.Scanner;
public class LargestNumber {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter the third number: ");
	        double num3 = scanner.nextDouble();

	        double largest = findLargestNumber(num1, num2, num3);
	        System.out.println("The largest number is: " + largest);

	        scanner.close();
	    }

	    public static double findLargestNumber(double a, double b, double c) {
	        double largest = a;
	        if (b > largest) {
	            largest = b;
	        }
	        if (c > largest) {
	            largest = c;
	        }
	        return largest;
	    }
	}


