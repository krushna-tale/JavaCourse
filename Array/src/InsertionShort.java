import java.util.Scanner;
public class InsertionShort 
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int n,i;
		int a[];
		System.out.println("Enter the size of array :-");
		n=in.nextInt();
		a = new int[n];

		for(i=0;i<n;i++)
		{
			System.out.println("Enter the data of array :-");
			a[i]=in.nextInt();
			
		}
		System.out.println("Array befor sorting :");
		
		for(i=0;i<n;i++)
		{
		
			System.out.print(a[i]+" ");
		}
		
		//for sort array in ascending order
		int j,temp = 0;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j]) {
					
			
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
			
		}
		System.out.println();
		
		
		//for display sorted array
		System.out.println("array after sorting :");
		for( i=0;i<n;i++) 
		{
			
			System.out.print(a[i]+" ");
			
		}

		
		
		
		
	}
	

}
