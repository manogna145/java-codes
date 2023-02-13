package basic;

public class Armstrong
{
	public static void main(String args[])
	{
		int x=500;
		displayArmstrong(x);
		
	}
	public static void displayArmstrong(int x)
	{
		int n;
		for(n=1;n<=x;n++)
		{
			if(isArmstrong(n)==true)
			{
				System.out.println(n);
			}
		}
	}
	public static boolean isArmstrong(int n)
	{
		int sum=0,r,temp;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==temp)
			return true;
		else
			return false;
	}
}
