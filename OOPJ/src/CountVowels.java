import java.util.Scanner;
public class CountVowels 
{
	public static void main(String args[])
	{
		String str;
		int vcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentences And Terminate With \"Quit\": ");
		
		str=sc.nextLine();
		while(str.compareToIgnoreCase("QUIT")!=0)
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
					vcount++;
			}
			str=sc.nextLine();
		}
		System.out.println("Voewls in Sentences: "+vcount);
		sc.close();
	}
}