package basic;

 public class Palindromee
{
	public static void displayPalindrome(int x)
	{
		for(int n=0;n<=x;n++)
		{
			if(isPalindrome(n)==true)
				System.out.println(n);
		}
	}
	public static boolean isPalindrome(int n)
	{
		int rev;
		rev=findReverse(n);
		if(rev==n)
			return true;
		else
			return false;
	}
	public static int findReverse(int n)
	{
		int rev=0,r;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10;
			n=n/10;
		}
		return rev;
	}
}
