package basic;

public class MobileNumber 
{
	public static void main(String args[])
	{
		int a[]= {9,8,2,3,4,5,6,7};
		int s1=0,s2=0,n=7;
		s1=a[0]+a[1];
		s2=s2+a[n]+a[n-1];
		System.out.println("sum of first two digits is "+s1);
		System.out.println("sum of lat two digits is "+s2);
		
	}
}
