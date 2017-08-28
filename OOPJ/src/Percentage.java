// program that calculate percentage marks of the student for 6 subjects
import java.util.Scanner;
public class Percentage 
{
	public static void main(String[] args)
	{
		int[] marks=new int[6];
		int total=0;
		float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of 6 Subject: ");
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter Marks of Subject "+(i+1)+": ");
			marks[i]=sc.nextInt();
			total=total+marks[i];
		}
		percentage=(float)total/6;
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+percentage);
	}
}
