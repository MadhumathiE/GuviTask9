package guvitask9;
import java.util.Scanner;
public class HotelTariffCalculator {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input: month, room rent, number of days
	        int month = sc.nextInt();
	        double roomRent = sc.nextDouble();
	        int numDays = sc.nextInt();

	        double peakSeasonMultiplier = 1.2; // 20% higher during peak seasons

	        switch (month) {
	            case 4:
	            case 5:
	            case 6:
	            case 11:
	            case 12:
	                roomRent *= peakSeasonMultiplier;
	                break;
	            default:
	                break;
	        }

	        // Calculate the total tariff
	        double totalTariff = roomRent * numDays;

	        // Output: Print the hotel tariff with 2 decimal places
	        System.out.printf("%.2f", totalTariff);

	        sc.close();
	    }
	}


