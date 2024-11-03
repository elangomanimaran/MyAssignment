package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class OddIndex {

	public static void main(String[] args) {
		String test = "changeme";
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < test.length(); i++) {
			if(i%2!=1) {
				list.add(test.charAt(i));
			}
			else {
				list.add(test.toUpperCase().charAt(i));

			}
		}
		System.out.println(list);

	}

}
