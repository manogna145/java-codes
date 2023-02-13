package commandlinearguments;

public class Additionsum 
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		n=args.length;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is "+sum);
	}
}
