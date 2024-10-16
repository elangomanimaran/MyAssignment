package week1.day1;

public class ForLoopCondition {
	public static void main(String[] args) {
		int maxRange=10;
		System.out.println("The Odd Numbers are");
		for (int i = 1; i<=maxRange; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
	}

}
