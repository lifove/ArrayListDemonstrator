package edu.handong.csee.java.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerReader {

	public static void main(String[] args) {
		IntegerReader intReader = new IntegerReader();
		
		intReader.run();

	}

	public void run() {
		
		ArrayList<Integer> intNumbers = getIntegerNumbers();
		
		printOutIntegerNumbers(intNumbers);
		
	}

	public void printOutIntegerNumbers(ArrayList<Integer> intNumbers) {
		
		System.out.println("The number of integer numbers from you: " + intNumbers.size());
		
		for(Integer currentInteger:intNumbers) {
			System.out.println(currentInteger);
		}
	}

	public ArrayList<Integer> getIntegerNumbers() {
		
		ArrayList<Integer> intNumbers = new ArrayList<Integer>();
		
		System.out.println("Put integer numbers in one line (seperator is space): ");
		
		Scanner myScanner = new Scanner(System.in);
		
		String lineWithMultipleIntegerNumbers = myScanner.nextLine();
	
		for(String currentStringNumber:lineWithMultipleIntegerNumbers.split(" ")) {
			intNumbers.add(Integer.parseInt(currentStringNumber));
		}
		
		myScanner.close();
		
		return intNumbers;
	}

}
