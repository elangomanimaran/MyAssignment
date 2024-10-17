package wee1.day3;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		int version = 10;
		if(version <0) {
			System.out.println("The input "+version+" is a negative number");
		}
		else if (version==0){
			System.out.println("Given input zero is neither positive nor negative");
		}
		else {
			System.out.println("the input "+version+" is a postive number");
		}
	}

}
