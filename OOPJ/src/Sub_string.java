
import java.util.Scanner;
public class Sub_string 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		int length=str.length();
		System.out.println("Length of "+str+": "+length);
		System.out.println("Second Half of " + str +": "+str.substring(length/2));
	}

}
