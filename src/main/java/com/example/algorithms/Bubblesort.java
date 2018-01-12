package com.example.algorithms;

public class Bubblesort implements Sort {

	@Override
	public int[] sort(int... arr) {
		int arrLength = arr.length - 1;
		for (int i = 0; i < arrLength; i++)
			for (int j = 0; j < arrLength - i; j++)
				if (arr[j] > arr[j + 1])
					swap(arr, j, j + 1);
		return arr;
	}

}
