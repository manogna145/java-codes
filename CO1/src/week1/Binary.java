package week1;
import java.util.Scanner;
public class Binary
{
	public static void main(String args[])
	{
		int n,r=0,c=0,x=0,t;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>=1)
		{
			r=r*10+(n%2);
			n=n/2;
		}
		while(r!=0)
		{
			x=r%10;
			r=r/10;
			if(x==1)
			{	c++;
			
			}
			
			
		}
		System.out.println(c);
	
	}

}
