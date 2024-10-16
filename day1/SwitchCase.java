package week1.day1;

public class SwitchCase {

	public static void main(String[] args) {
	int day=-1;
	if (day>=0) {
		
		switch (day) {
		case 1:
		{
			System.out.println("The input is a postive value");
			System.out.println("The day is Monday");
		}	
		break;
		case 2:
		{
			System.out.println("The input is a postive value");
			System.out.println("The day is Tuesday");
		}	
		break;
		case 3:
		{
			System.out.println("The input is a postive value");
			System.out.println("The day is Wednesday");
		}	
		break;
		case 4:
		{
			System.out.println("The input is a postive value");
			System.out.println("The day is Thurstday");
		}	
		break;
		case 5:
		{
			System.out.println("The input is a postive value");
			System.out.println("The day is Friday");
		}	
		case 6:
		{
			System.out.println("The input is a postive value");
			System.out.println("The day is Saturday");
		}
		case 7:
		{
			System.out.println("The input is a postive value");
			System.out.println("The day is Sunday");
		}	
		break;
		default:
		{
			System.out.println("The input is out of range");
		}
			break;
		}
	}
	else
	{
		System.out.println("The input is a negative value");
	}
	
	}

}
