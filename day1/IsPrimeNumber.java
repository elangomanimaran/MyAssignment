package week1.day1;


public class IsPrimeNumber {

	public static void main(String[] args) {
		int n =19;
		boolean isPrime = true;
		for (int i=2; i<n; i++) {
			if (n % i == 0) {
				isPrime = false;
		}
		}
		
			if (isPrime==true) {
				System.out.println("The number "+n+" is a prime number");
			}
			else {
			System.out.println("The number "+n+" is nota prime number");
		}
	}		
}

