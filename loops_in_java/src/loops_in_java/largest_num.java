package loops_in_java;
import java.util.Scanner;

public class largest_num {
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		int n,i,large,num;
		System.out.println("How many number");
		n=sc.nextInt();
		large=0;
		for(i=1;i<=n;i++)
		{

			System.out.println("Enter a number ");
			num=sc.nextInt();
		
		
		if(num>large)
			large=num;
		}
		System.out.println("largest number is= "+large);

		
				
	}

}
