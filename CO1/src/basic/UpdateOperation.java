package basic;

public class UpdateOperation
{
	public static void main(String args[])
	{
		int a[]= {12,3,4,5,7};
		int b[];
		b=UpdateArray(a);
		System.out.println("updated array is ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	public static int[] UpdateArray(int a[])
	{
		int b[]=a;
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]+2;
		}
			return b;	
	}
}
