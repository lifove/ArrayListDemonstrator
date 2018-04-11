package edu.handong.csee.java.example;

import java.util.ArrayList;
import java.util.Collections;

public class DeepCopyTester {
	
	public static void main(String[] args) {
		DeepCopyTester tester = new DeepCopyTester();
		tester.run();
	}

	public void run() {
		
		IntegerReader intReader = new IntegerReader();
		
		ArrayList<Integer> intNumbers = intReader.getIntegerNumbers();
		ArrayList<Integer> intNumbersCopiedShallowly = intNumbers;
		
		intReader.printOutIntegerNumbers(intNumbers);
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer> intNumbersDeeplyCopied = (ArrayList<Integer>) intNumbers.clone();
		
		intNumbersCopiedShallowly.add(0);
		
		Collections.sort(intNumbersDeeplyCopied);
		
		intReader.printOutIntegerNumbers(intNumbers);
		
		System.out.println("Sorted ArrayList: ");
		intReader.printOutIntegerNumbers(intNumbersDeeplyCopied);
	}

}
