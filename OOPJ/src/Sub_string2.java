
import java.util.Scanner;
public class Sub_string2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		int length=str.length();
		System.out.println("First Half of " + str +": "+str.substring(0,(length/2)+1));
	}

}
