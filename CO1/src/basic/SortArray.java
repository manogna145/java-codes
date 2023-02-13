package basic;
import java.util.Scanner;
import java.util.Arrays;
public class SortArray 
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{  
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
