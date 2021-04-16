package largest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSelectionSort {
	private SelectionSort temp1 = new SelectionSort();
	@Test
	public void test() {
		//testPositive();
		//testNegative();
		//testMixed();
		testDuplicates();
	}    
	
	public testSelectionSort() {
		
	}    
	
	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		
		/** add tests to check for this unit test **/
		
		int[] testArr = new int [5];
		testArr = temp1.basicSelectionSort(arr);
		
		for (int i = 0; i < 5; i++) 
		{
			String msg = "Positive index " + i;
			assertTrue(msg, testArr[i] == Sortedarr[i]);
		}
	}    
	
	public void testNegative() {
		/** Test data contains negative values only **/
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		
		int[] testArr = new int [5];
		testArr = temp1.basicSelectionSort(arr);
		
		for (int i = 0; i < 5; i++) 
		{
			String msg = "Negative index " + i;
			assertTrue(msg, testArr[i] == Sortedarr[i]);
		}
	}    
	
	public void testMixed() {
        /** Test data contains with both positive, negative and zeros **/    
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -8;
		Sortedarr[2] = 2;
		Sortedarr[3] = 7;
		Sortedarr[4] = 9;
		
		int[] testArr = new int [5];
		testArr = temp1.basicSelectionSort(arr);
		
		for (int i = 0; i < 5; i++) 
		{
			String msg = "Mixed index " + i;
			assertTrue(msg, testArr[i] == Sortedarr[i]);
		}
	}    
	
	public void testDuplicates() {
		/** Test data contains duplicates **/    
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 8;
		arr[2] = 1;
		arr[3] = 10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 1;
		Sortedarr[1] = 2;
		Sortedarr[2] = 8;
		Sortedarr[3] = 8;
		Sortedarr[4] = 10;
		
		int[] testArr = new int [5];
		testArr = temp1.basicSelectionSort(arr);
		
		for (int i = 0; i < 5; i++) 
		{
			String msg = "Duplicate index " + i;
			assertTrue(msg, testArr[i] == Sortedarr[i]);
		}
	}
}