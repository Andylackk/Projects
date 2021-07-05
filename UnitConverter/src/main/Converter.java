package main;
import java.util.Scanner;


public class Converter {
	public static void main(String[] args) {
		
		System.out.println("Please select a type of conversion: "
				+ "1. Volume Conversions "
				+ "2. Distance Conversions "
				+ "3. Quit ");
		
		
		Scanner scan = new Scanner(System.in);
		int menuSelection = scan.nextInt();
		
		switch(menuSelection) {
			case 1: 
				System.out.println("Volume Conversions.  "
						+ "Please select which type of volume to convert: "
						+ "1. Cups to Teaspoons "
						+ "2. US Gallons to Imperial Gallons "
						+ "3. Quit");
						Scanner volScan = new Scanner(System.in);
						int volumeSelection = volScan.nextInt();
						
							switch(volumeSelection) {
							case 1:
								System.out.println("Cups to Teaspoons. "
										+ "Please enter amount of cups");
								int numofCups = volScan.nextInt();
								int numofTeaspoons = numofCups * 48;
								System.out.println(numofCups + " cups equals " + numofTeaspoons + " teaspoons");
							break;
							case 2:
								System.out.println("US Gallons to Imperial Gallons. "
										+ " Please enter a number of gallons: ");
										int numofGallons = volScan.nextInt();
										double numofImperialGallons = numofGallons * 1.2009;
										System.out.println(numofGallons + " gallons equals " + numofImperialGallons + " Imperial Gallons.");
								break;
							case 3: 
								System.out.println("Have a great day!");
							break;
							default:
								System.out.println("Please select from one of the options");
							}
							break;
			case 2:
				System.out.println("Distance Conversions.  "
						+ "Please select which type of distance to convert: "
						+ "1. Miles to Kilometers "
						+ "2. Inches to Centimeters "
						+ "3. Quit ");
						Scanner disScan = new Scanner(System.in);
						int distanceSelection = disScan.nextInt();
						
							switch(distanceSelection) {
							case 1:
								System.out.println("Miles to Kilometers. "
										+ "Please enter amount of miles");
								int miles = disScan.nextInt();
								double numofKilometers = miles * 1.609344;
								System.out.println(miles + " miles equals " + numofKilometers + " Kilometers");
							break;
							case 2:
								System.out.println("Inches to Centimeters. "
										+ " Please enter a number of inches: ");
										int inches = disScan.nextInt();
										double centimeters = inches * .004;
										System.out.println(inches + " inches equals " + centimeters + " centimeters.");
							break;
							case 3: 
								System.out.println("Have a great day!");
							break;
							default:
								System.out.println("Please select from one of the options");
							}
							break;
							}
			
				
		}
		
		
	}

