package loops_in_java;
import java.util.Scanner;

public class Large_small_numbers {
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		int n,i,large,small,num;
		System.out.println("How many number");
		n=sc.nextInt();
		
		System.out.println("Enter the first number: ");
		num=sc.nextInt();
		large=small=num;
		
		for(i=1;i<=n-1;i++)
		{

			System.out.println("Enter a number ");
			num=sc.nextInt();
		
		
		if(num>large)
			large=num;
		if(num<small)
			small=num;
		}
		System.out.println("Largest number is= "+large+"\nSmallest number is "+small);

		
				
	}

}
