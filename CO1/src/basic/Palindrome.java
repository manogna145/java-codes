package basic;

public class Palindrome 
{
	public static void main(String args[])
	{
		int n,result;
		n=1221;
		result=reverse(n);
		if(result==1)
			System.out.println("Palindrome");
		else
			System.out.println(" Not Palindrome");
	}


public static int reverse(int n)
{
	int r=0,f=0,d,t;
	t=n;
	while(n!=0)
	{
		d=n%10;
		r=r*10+d;
		n=n/10;
	}
	if(r==t)
		f=1;
	
	return f;
}
}