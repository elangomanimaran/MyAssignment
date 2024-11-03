package week3.day1;


public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String txt="I am a Software tester";
				String a[]=txt.split(" ");
				int len=a.length;
				System.out.println("Length :" +len);
				String temp="";
				for(int i=0;i<len;i++) {
					if(i%2!=0)
					{
						char b[]=a[i].toCharArray();
						int l=b.length;
						for(int j=l-1;j>=0;j--)
						{
							temp=temp+b[j];
						}
						a[i]=temp;
					}
					
				}
				String txt2="";
				for(int k=0;k<len;k++) {
					txt2=(txt2+a[k]+" ");
					
				}
				System.out.println(txt2);
			}
	}
