package week1.day4;

public class FindPalindrome {

	public static void main(String[] args) {
		int input = 121;
		int output = 0;
		int rem;
		for(int i=input;i>0;i=i/10) {
			rem=i%10;
			output=(output*10)+rem;
		}
		if (input==output) {
			System.out.println("Number "+input+" is Palindrome");

		}else {
			System.out.println("Number "+input+" is not palindrome");
		}
	}
}