import java.util.Scanner;

public class StringPyramid 
{
	public static void main(String[] args)
	{
		System.out.print("Enter String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<(l-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" "+str.charAt(k));
			}
			System.out.println();
		}
		sc.close();
	}
}
