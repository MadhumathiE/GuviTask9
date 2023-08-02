package guvitask9;
import java.util.Scanner;
public class StarPattern {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();
	        printStarPattern(numRows);
	    }

	    public static void printStarPattern(int numRows) {
	        for (int i = 1; i <= numRows; i++) {
	            for (int j = 1; j <= numRows; j++) {
	                if (j == i || j == numRows - i + 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


