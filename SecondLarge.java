package week3.day1;

import java.util.ArrayList;
import java.util.List;


public class SecondLarge {

	public static void main(String[] args) {
		int []array = {3, 2, 11, 4, 6, 7};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		list.sort(null);
		System.out.println("The list values are : "+list);
		int num = list.size()-2;
		System.out.println("Second Largest number is : "+list.get(num));
		
	}

}
