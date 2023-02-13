package basic;

import java.util.Scanner;
public class Factorial1
{
	public static void main(String args[])
	{
		int n,i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);
		
	}

}
