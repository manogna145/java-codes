package commandlinearguments;

public class Calculator 
{
	public static void main(String args[])
	{
		int a,b;
		char ch;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		ch=args[2].charAt(0);
		if(ch=='+')
		System.out.println("addition is "+(a+b));
		else if(ch=='*')
			System.out.println("addition is "+(a*b));
		else if(ch=='-')
			System.out.println("addition is "+(a-b));
		else if(ch=='/')
			System.out.println("addition is "+(a/b));
		else if(ch=='%')
			System.out.println("addition is "+(a%b));
	}
}
