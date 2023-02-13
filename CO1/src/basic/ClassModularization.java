package basic;

public class ClassModularization 
{ 
	public static void main(String args[])
	{
		int n,result;
		n=7;
		result=Demo.factorial(n);
		System.out.println("factorilal of 7 is "+result);
		n=12;
		result=Demo.factorial(n);
		System.out.println("factorilal of 12 is "+result);

	}

}
class Demo
{
	public static int factorial(int n)
	{
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}