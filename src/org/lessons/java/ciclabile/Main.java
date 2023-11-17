package org.lessons.java.ciclabile;

public class Main {
	
	public static void printArrayValues(Ciclable c) {
		int i = 0;
		while (c.hasOtherValues()) {
			System.out.println("Call n. " + i + " --> Value: " + c.getNextValue());
			i++;
		}
		System.out.println("No more values in the array...");
	}
	
	public static void main(String[] args) {
		
		int[] intArray = {2, 5, 4, 8, 3, 0, 5, 4, 2};
		
		Ciclable c1 = new Ciclable(intArray);
		printArrayValues(c1);
		
		System.out.println("\n\n");
		
		Ciclable c2 = new Ciclable();
		c2.addValue();
		c2.addValue();
		c2.addValue();
		printArrayValues(c2);
	}
}
