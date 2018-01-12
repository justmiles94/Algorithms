package com.example.algorithms;

public class ArrayTypes {
	
	static {
		mathRandomArray = randomArray(100);
	}

	static int[] randomArray = { 6,3,1,3,5,67,8,3,2,0};
	static int[] randomArraySorted = {0, 1, 2, 3, 3, 3, 5, 6, 8, 67};
	static int[] nullArray;
	static int[] emptyArray = {};
	static int[] singleElementArray = {0};
	static int[] mathRandomArray;
	
	public static int[] randomArray(int size) {
		int[] array = new int[size];
		for( int i = 0; i < size; i++) {
			array[i] = (int) (Math.random()*size);
		}
		return array;
	}

}
