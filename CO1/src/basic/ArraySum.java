package basic;
import java.util.Scanner;
public class ArraySum 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter n");
		n=s.nextInt();
		int sum=0;
		int a[]=new int[n];
		System.out.println("enter elements in array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is "+sum);
	}
}
