package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] splitted = text.split(" ");
		
		int count = 0;
		for(int i=0; i<splitted.length; i++) {
			for(int j=i+1; j<splitted.length; j++) {
				if(splitted[i].equalsIgnoreCase(splitted[j])) 
				{
					splitted[j] = " "; 
					count=1; 
				}
				if(count ==1)  {
					for(int k = 0; k<splitted.length; k++) {
						System.out.println(splitted[k]+ " ");
					}

				}

			}
		}
	}
}



