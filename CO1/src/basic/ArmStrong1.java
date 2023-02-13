package basic;
import java.util.Scanner;
public class ArmStrong1
{
	public static void main(String args[])
	{
		int n,t,sum=0,i,dig=0,z,r;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		t=n;
		while(n!=0)
		{
			n=n/10;
			dig++;
		}
		n=t;
		while(n!=0)
		{
			r=n%10;
			z=1;
			for(i=1;i<=dig;i++)
			{
				z=z*r;
			}
			sum=sum+z;
			n=n/10;
		}
		if(sum==t)
		System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}
