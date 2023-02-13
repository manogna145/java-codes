package mypack2;
import mypack1.Demo1;
public class PackModularization
{
	public static void main(String args[])
	{
		int n,res;
		n=5;
		res=Demo1.factorial(n);
		System.out.println("factorial is "+res);
	}
}
