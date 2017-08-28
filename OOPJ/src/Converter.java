//Program to convert rupees into dollar.
import java.util.Scanner;
public class Converter 
{
	public static void main(String[] args)
	{
		int rate=67;
		System.out.println("Enter Rupees: ");
		Scanner sc=new Scanner(System.in);
		int rupee=sc.nextInt();
		//Formula to convert rupees into dollar
		float dollar=(float)rupee/rate;
		//Formula to convert into cent
		System.out.println("Dollar: " + dollar);
	}
}