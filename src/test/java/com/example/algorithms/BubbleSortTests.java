package com.example.algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.algorithms.sorting.Bubblesort;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BubbleSortTests {
		
	@Test
	public void bubbleSortTest() {
		arraysEqual(ArrayTypes.randomArraySorted, ArrayTypes.randomArray);
	}
	
//	@Test
//	public void bubbleSortNullArrayTest() {
//		arraysEqual(ArrayTypes.nullArray, ArrayTypes.nullArray);		
//	}
	
	public void arraysEqual(int[] expected, int[] actual) {
		Assert.assertArrayEquals(expected, new Bubblesort().sort(actual));
	}

}
