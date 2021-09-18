package loops_in_java;
import java.util.Scanner;


public class fibonacci_numbers
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		
		int n,i;
		int a,b,c;
		a=0;b=1;
		System.out.println("Enter the fibonacci numbers: ");
		n=in.nextInt();
		System.out.print(a+" "+b+" ");
		for( i=1;i<=n-2;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;b=c;
		}
		 
		
		
		
	}

}
