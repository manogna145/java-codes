package week1;
import java.util.Scanner;
public class Electricitybill 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in); 
			double bill=0;
			int n;
			n=s.nextInt();
			if(n<50)
			{
				bill=2*n;
			}
			if(n>=51&&n<=100)
			{
				bill=3*n;
			}
			if(n>=101&&n<=300)
			{
				bill=(5*n)+100;
			}
			if(n>=301&&n<=450)
			{
				bill=(6*n)+200;
			}
			System.out.println("bill is "+bill);
			
			
	}
}
