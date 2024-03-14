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
		int[] arrWork = array;
		if (index>=0 && index<=array.length) {
		arrWork = new int[array.length+1];
//		System.arraycopy(array,0,arrWork,0,array.length);
//		int[] arrNumber = {number};
//		int[] arrEnd = new int[arrWork.length-index];
//		System.arraycopy(arrWork,index, arrEnd, 0, arrWork.length-index);
//		System.arraycopy(arrNumber, 0, arrWork, index, 1);
//		System.arraycopy(arrEnd, 0, arrWork, index+1, arrWork.length-index-1);
		System.arraycopy(array,0,arrWork,0,index);
		System.arraycopy(array,index,arrWork,index+1,array.length-index);
		arrWork[index]=number;
	}
		return arrWork;
	}
	
	public static int[] removeNumber(int[] array, int index) {
		int[] arrWork = array; 
		if(index>=0 && index<array.length) {
		arrWork = new int[array.length-1];
//		int[] arrEnd = new int[array.length-1-index];
//		int[] arrBegin = new int[index];
//		System.arraycopy(array,index+1, arrEnd, 0, array.length-1-index);
//		System.arraycopy(array,0, arrBegin, 0, index);
//		System.arraycopy(arrEnd,0,arrWork, index, arrEnd.length);
//		System.arraycopy(arrBegin,0, arrWork, 0, arrBegin.length);
		System.arraycopy(array,0,arrWork, 0, index);
		System.arraycopy(array,index+1,arrWork, index, array.length-index-1);
		}
		return arrWork;
	}
	public static int[] insertSorted(int[] sortedArray, int number) {
		
		int index=Arrays.binarySearch(sortedArray, number);
		if ( index < 0 ) {
			index = -(index + 1);
			
		}
		return insertNumber(sortedArray,  index,  number);
	}
		
		
		//TODO
		//insert number into sorted array with keeping the sorted order
		//apply method binarySearch of the class Arrays
	 
	
}
