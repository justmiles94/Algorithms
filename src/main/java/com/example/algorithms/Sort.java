package com.example.algorithms;

public interface Sort {
	
	public int[] sort(int ...arr);
	
	public default int[] swap(int[] arr, int less, int more) {
		int temporary = arr[less];
		arr[less] = arr[more];
		arr[more] = temporary;
		return arr;
	}

}
