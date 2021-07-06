package main;
import java.util.Scanner;


public class Converter {
	public static void main(String[] args) {
		
		
		mainMenu();
		
		
		Scanner scan = new Scanner(System.in);
		int menuSelection = scan.nextInt();
		
		switch(menuSelection) {
			case 1: 
				System.out.println("Volume Conversions.  "
						+ "Please select which type of volume to convert: "
						+ "1. Cups to Teaspoons "
						+ "2. US Gallons to Imperial Gallons "
						+ "3. Quit"
						+ "4. Main Menu");
				
						Scanner volScan = new Scanner(System.in);
						int volumeSelection = volScan.nextInt();
						
							switch(volumeSelection) {
							case 1:
								System.out.println("Cups to Teaspoons. "
										+ "Please enter amount of cups");
								int numofCups = volScan.nextInt();
								System.out.println(numofCups + " cups equals " + getTeaspoons(numofCups) + " teaspoons.");
								
							break;
							case 2:
								System.out.println("US Gallons to Imperial Gallons. "
										+ " Please enter a number of gallons: ");
										int numofGallons = volScan.nextInt();
										System.out.println(numofGallons + " gallons equals " + getImpGallons(numofGallons) + " Imperial gallons.");
								break;
							case 3: 
								exit();
							break;
							case 4: 
								mainMenu();
							default:
								defaultMssg();
							}
							break;
			case 2:
				System.out.println("Distance Conversions.  "
						+ "Please select which type of distance to convert: "
						+ "1. Miles to Kilometers "
						+ "2. Inches to Centimeters "
						+ "3. Quit "
						+ "4. Main Menu");
						Scanner disScan = new Scanner(System.in);
						int distanceSelection = disScan.nextInt();
						
							switch(distanceSelection) {
							case 1:
								System.out.println("Miles to Kilometers. "
										+ "Please enter amount of miles");
								int miles = disScan.nextInt();
								System.out.println(miles + " miles equals " + getKilometers(miles) + " Kilometers");
							break;
							case 2:
								System.out.println("Inches to Centimeters. "
										+ " Please enter a number of inches: ");
										int inches = disScan.nextInt();
										System.out.println(inches + " inches equals " + getCentimeters(inches) + " centimeters.");
							break;
							case 3: 
								exit();
	
							break;
							case 4:
								mainMenu();
							break;
							default:
								defaultMssg();
							}
							break;
							}
			
				
		}
	public static int getTeaspoons(int numofCups) {
		int numOfTeaspoons = numofCups * 48;
		return numOfTeaspoons;
		
	}
	public static double getImpGallons(int gallons) {
		double numofImpGallons = gallons * 1.2009;
		return numofImpGallons;
	}
	public static double getKilometers(int miles) {
		double numofKilometers = miles * 1.609344;
		return numofKilometers;
	}
	public static double getCentimeters(int inches) {
		double numofCentimeters = inches *.064;
		return numofCentimeters;
	}
	public static void mainMenu() {
		System.out.println("Please select a type of conversion: "
				+ "1. Volume Conversions "
				+ "2. Distance Conversions "
				+ "3. Quit ");
	}
	public static void exit() {
		System.out.println("Have a great day!");
	}
	public static void defaultMssg() {
		System.out.println("Please select from one of the options.");
	}
	}

