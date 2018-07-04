package com.example.algorithms.sorting;

public class Quicksort implements Sort {

	@Override	
	public int[] sort(int... arr){
		return sort(arr, 0, arr.length);
	}
	
	private int[] sort(int[] arr, int low, int high){
		if(low < high){
			int index = partition(arr, low, high);
			sort(arr, low, index - 1);
			sort(arr, index + 1, high);
		}
		return arr;
	}
	
	private int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j <= high - 1; j++){
			if(arr[j] <= pivot){
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

}
