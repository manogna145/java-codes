package week1;
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		int i,n3=0,n1,n2,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n ");
		n=s.nextInt();
		n1=0; n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for(i=0;i<n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}
}
