package org.lessons.java.ciclabile;

import java.util.Random;

public class Ciclable {
	
	private int[] intArray;
	private int currentId;
		
	public Ciclable(int[] intArray) {
		currentId = 0;
		setIntArray(intArray);
	}
	
	public Ciclable() {
		int[] intArray = new int[0];
		setIntArray(intArray);
	}

	public int getCurrentId() {
		return currentId;
	}

	public int[] getIntArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}
	
	public int getNextValue() {
		int currentValue = intArray[getCurrentId()];
		currentId++;
		return currentValue;
	}
	
	public boolean hasOtherValues() {
		return (getCurrentId() < getIntArray().length);
	}
	
	public void addValue() {
		Random rnd = new Random();
		
		int[] intArray = getIntArray();
		int[] auxArray = new int[intArray.length + 1];
		for (int i = 0; i < intArray.length; i++) {
			auxArray[i] = intArray[i];
		}
		auxArray[intArray.length] = rnd.nextInt(10);
		setIntArray(auxArray);
	}
}
