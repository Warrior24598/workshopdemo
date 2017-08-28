
import java.util.Scanner;
public class Check 
{
	public static void main(String[] args) 
	{
		int count_v=0,count_c=0;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
				count_v++;
			else if(ch==' ')
				continue;
			else
				count_c++;
		}
		System.out.println(str+" contians: "+count_c+" Consonants and "+count_v+" Vowels");
	}

}
