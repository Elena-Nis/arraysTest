package telran.util;

import java.util.Arrays;
 

public class ArraysInt {
	public static int[] addNumber(int[] array, int number) {
		int arrNumber[];
		arrNumber=Arrays.copyOf(array,array.length+1);
		arrNumber[array.length]=number;
		return arrNumber;
	}     
	public static int[] insertNumber(int[] array, int index, int number) {
	 	int[] arrWork= new int[array.length+1];
		System.arraycopy(array,0,arrWork,0,array.length);
		int[] arrNumber = {number};
		int[] arrEnd = new int[arrWork.length-index];
		System.arraycopy(arrWork,index, arrEnd, 0, arrWork.length-index);
		System.arraycopy(arrNumber, 0, arrWork, index, 1);
		System.arraycopy(arrEnd, 0, arrWork, index+1, arrWork.length-index-1);
		 		return arrWork;
	}
	
	public static int[] removeNumber(int[] array, int index) {
		//TODO
		//apply method arraycopy of class System
		return null;
	}
	public static int[] insertSorted(int[] sortedArray, int number) {
		//TODO
		//insert number into sorted array with keeping the sorted order
		//apply method binarySearch of the class Arrays
		return null;
	}
}