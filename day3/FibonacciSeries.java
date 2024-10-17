package wee1.day3;

public class FibonacciSeries {
public void fibonacci(int range)
{
int first=0, second=1;
System.out.print(first+","+second);
	for (int i=0; i<range; i++)
	{
		
		int third = first + second;
		first = second;
		second = third;
		System.out.print(","+third);
		}
	
	}
	public static void main(String[] args) {
		FibonacciSeries fibSeries =new FibonacciSeries();
		fibSeries.fibonacci(8);

	}

}
