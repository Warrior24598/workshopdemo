import java.util.Scanner;

public class Upper_Letter 
{
	public static void main(String[] args)
	{
		int count=0;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Line: ");
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				count++;
			
			while(str.charAt(i)!=' '&&i+1<str.length())
			{
				i++;
			}
		}
		System.out.println("Words Starting With Caps: "+count);
		sc.close();
	}
}
