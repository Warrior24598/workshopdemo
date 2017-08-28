import java.util.Scanner;

public class PalindromeStringRev 
{
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		str.append(sc.nextLine());
		
		StringBuffer strrev=new StringBuffer();
		strrev.append(str);
		strrev.reverse();
		
		if(str.toString().compareToIgnoreCase(strrev.toString())==0)
			System.out.println("String is Palindrom");
		else
			System.out.println("String is Not Palindrom");
		sc.close();
	}
}