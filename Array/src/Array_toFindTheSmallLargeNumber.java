import java.util.Scanner;

public class Array_toFindTheSmallLargeNumber 
{
	public static void main(String args[]) 
	{
		Scanner in= new Scanner(System.in);
		int n,i,li=0,ui=0;
		int a[];
		int key=77;
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
		
			System.out.print(+a[i]+" ");
		}
		//array sorting start
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
		//binary searxh start
		 while(li<=ui)
	        {
	        	
	        	 ui=a.length-1;
	             int mid=(li+ui)/2;

	            if(a[mid]<key)
	            {
	                li=mid+1;
	            }
	            else if(a[mid]==key)
	            {
	                System.out.print("\nKey is found at index : "+mid);
	                break;
	            }
	            else
	            {
	                ui=mid-1;
	            }
	            mid=(li+ui)/2;

	        }
	        if (li>ui)
	        {

	            System.out.println("\n"+key+" : not found in the array");
	        }



		
	}

}
