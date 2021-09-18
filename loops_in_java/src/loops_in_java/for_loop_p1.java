package loops_in_java;
import java.util.Scanner;

public class for_loop_p1
{
	public static void main(System args[]) 
	{
		Scanner in= new Scanner(System.in);
		int n,i;
		int a[];
		System.out.println("Enter the size of array :-");
		n=in.nextInt();
		a = new int[n];
		System.out.print("array before sorting :"+n);
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the data of array :-");
			a[i]=in.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		
	
		
	}

}
