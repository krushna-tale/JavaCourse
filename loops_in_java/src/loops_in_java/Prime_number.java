package loops_in_java;
import java.util.Scanner;

public class Prime_number 
{
	public static void main(System args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		boolean status=true;
		System.out.println("Enter the Number:" );
		n=sc.nextInt();
		for(i=2;i<=n-1;i++)
		{
			if(n%i==0) 
			{
				status=false;
				break;
			}
		}
		if(status==true)
			System.out.println("It is a prime number");
 		else
			System.out.println("It is not a prime number");
			
	}

}
