package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {
	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 11, 6, 8};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		list.sort(null);
		System.out.println(list);
		int firstnum = list.get(0);
		int lastnum = list.get(list.size()-1);
		for(int i=firstnum; i<lastnum; i++)
		{
			if(!list.contains(i)) {
				System.out.println(i);
			}
		}
	}
}


