package basic;
import java.util.Scanner;
public class StringBalance 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("enter a string");
		str=s.next();
		int count=0,result=0,i;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='L')
				count++;
			else
				count--;
			if(count==0)
				result++;
		}
		System.out.println("balanced string is "+result);
	}
}
