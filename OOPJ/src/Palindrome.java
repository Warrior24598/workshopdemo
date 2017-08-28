import java.util.Scanner;
public class Palindrome 
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter String To Check: ");
		str=sc.nextLine();
		
		for(int i=0,j=str.length()-1;i<str.length()/2+1;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("'"+str+"' is Palindrome");
		else
			System.out.println("'"+str+"' is Not Palindrome");
			
		sc.close();
	}
}
