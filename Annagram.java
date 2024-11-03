package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class Annagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		for (int i = 0; i < text1.length(); i++) {
			list1.add(text1.charAt(i));
		}
		for (int j = 0; j < text2.length(); j++) {
			list2.add(text2.charAt(j));
		}
		list1.sort(null);
		System.out.println(list1);
		list2.sort(null);
		System.out.println(list2);
		if(list1.equals(list2))
		{
			System.out.println("The two strings are annagramm");
		}
		else
		{
			System.out.println("The given string is not annagram");
		}
	}

}
