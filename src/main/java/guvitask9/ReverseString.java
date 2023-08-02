package guvitask9;
import java.util.Scanner;

public class ReverseString {

	
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();
		        String reversedString = reverseString(inputString);

		        System.out.println("Reversed string: " + reversedString);
		    }

		    public static String reverseString(String inputString) {
		        StringBuilder reversedStringBuilder = new StringBuilder();
		        for (int i = inputString.length() - 1; i >= 0; i--) {
		            reversedStringBuilder.append(inputString.charAt(i));
		        }
		        return reversedStringBuilder.toString();
		    }
	}
	

