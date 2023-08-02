package guvitask9;
import java.util.Scanner;
public class AnnaUniversityGradingSystem {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the marks scored by the student: ");
	        int marks = scanner.nextInt();

	        String grade = calculateGrade(marks);
	        System.out.println("Grade: " + grade);
	    }

	    public static String calculateGrade(int marks) {
	        if (marks > 100 || marks < 0) {
	            return "Invalid input";
	        } else if (marks >= 90 && marks <= 100) {
	            return "S";
	        } else if (marks >= 80 && marks <= 89) {
	            return "A";
	        } else if (marks >= 70 && marks <= 79) {
	            return "B";
	        } else if (marks >= 60 && marks <= 69) {
	            return "C";
	        } else if (marks >= 50 && marks <= 59) {
	            return "D";
	        } else {
	            return "E";
	        }
	    }
	}


