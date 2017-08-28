import java.util.Scanner;
public class Pattern 
{
	public static void main(String args[])
	{
		int i,j,k;
		Scanner sc=new Scanner (System.in);
		System.out.print("Ente Number: ");
		int n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		sc.close();
	}
}