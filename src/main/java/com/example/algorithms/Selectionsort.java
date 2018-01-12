package com.example.algorithms;

public class Selectionsort implements Sort {

	@Override	
	public int[] sort(int... arr){
		int[] sorted = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			int minimum = Integer.MIN_VALUE;
			for(int j = i; j < arr.length; j++){
				if(minimum > arr[j]){
					minimum = arr[j];
				}
			}
			sorted[i] = minimum;
		}
		return sorted;
	}

}
