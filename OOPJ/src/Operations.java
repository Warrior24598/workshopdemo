//Program to enter two numbers and perform mathematical operations on them 
import java.util.Scanner;
public class Operations 
{
	public static void main(String[] args)
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		num1=sc.nextInt();
		System.out.println("Enter Number 2: ");
		num2=sc.nextInt();
		System.out.println("Addition: "+(num1+num2));
		System.out.println("Subtraction: "+(num1-num2));
		System.out.println("Multiplication: "+(num1*num2));
		System.out.println("Division: "+(num1/num2));
		System.out.println("Modulo: "+(num1%num2));
	}
}