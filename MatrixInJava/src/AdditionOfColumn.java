//Transpose of matrix
//The row and column have been same

import java.util.Scanner;
public class AdditionOfColumn
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][],n,i,j;//n mining is row as well as column
		System.out.println("Enter the value of Row and column in single number : ");
		
		n=sc.nextInt();
		
		a=new int [n][n];
		// input the data matrix
		for(i=0;i<n;i++) 
		{
			for(j=0;j<n;j++) 
			{
				System.out.println("Enter the data of element:");
				a[i][j]=sc.nextInt();
			}
			
		}
		
		//Print the Original matrix
		System.out.println("Befor the transpose of matrix");
		for(i=0;i<n;i++) 
		{
		
			for(j=0;j<n;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		//Transpose of matrix ...mins replace with each other...b[i][j]=a[j][i];
		System.out.println("After the transpose of matrix");
		int b[][]=new int[n][n];
		for(i=0;i<n;i++) 
		{                             //we cannot replace single matrix(array) with each other
		int sum=0;                   //to replace or transpose matrix declear the new one array
		
			for(j=0;j<n;j++) 
			{
				b[i][j]=a[j][i];
				sum=sum+b[i][j];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();//new line sathi
			
		}
		
	}
}
