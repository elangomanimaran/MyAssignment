package wee1.day3;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		int array[] ={2, 2, 4, 5, 6, 8, 9, 9, 6, 7};
		int arraylength = array.length;
		System.out.println(arraylength);
		Arrays.sort(array);
	for (int i=0; i<arraylength-1; i++) {
		if (array[i]==array[i+1])
		{
			System.out.println(array[i]);
	
	}
	}
	}
}

