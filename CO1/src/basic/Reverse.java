package basic;

public class Reverse
{
	public static void main(String args[])
	{
		int n,res;
		n=1234;
		res=Demoo.reverse1(n);
		System.out.println("reverse of n is "+res);
	}
}

class Demoo
{
	public static int reverse1(int n)
	{
		int r=0,d;
		while(n!=0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		return r;
	}
}