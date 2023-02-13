package week1;

import java.util.Scanner;
public class Pattern
{
	public static void main(String args[])
	{
		int i,n,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n ");
		n=s.nextInt();
		
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=1;j--)
			{
				if(j<=i) 
				{
					System.out.print("*");
				}
					
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

