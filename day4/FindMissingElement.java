package week1.day4;

import java.util.stream.IntStream;

public class FindMissingElement {


	public static void main(String[] args) {
		int  array[] = {1,4,3,2,8,6,7,9};
		int max = array[0];
		int sum =IntStream.of(array).sum();
		for(int i=0; i<array.length; i++)
		{
			if (array[i]>max)
				max=array[i];
		}
		int missingNumber = (max*(max+1)/2)-sum;
		System.out.println("The missing Number form the string is : "+missingNumber);
	}

}
