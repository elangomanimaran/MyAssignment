package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Manimaran";
		char[] charArray= str.toCharArray();
		System.out.println(charArray);
		for (int i=charArray.length-1; i >=0; i--){
			System.out.print(charArray[i]);
		}
		
		
	}

}
