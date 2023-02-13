package basic;

public class Array
{
	public static void main(String args[])
	{
		int a[]= {8,9,13,4,10};
		int t=0,i,l,s,avg;
		l=a[0];
		s=a[0];
		for(i=0;i<=4;i++)
		{
			if(a[i]>=l)
			{
				l=a[i];
			}
			if(a[i]<=s)
			{
				s=a[i];
			}
		}
		System.out.println("largest is "+l);
		System.out.println("smallest is "+s);
		for(i=0;i<=4;i++)
		{
			t=t+a[i];
		}
		avg=t/5;
		System.out.println("average is "+avg);
	}
	
}
