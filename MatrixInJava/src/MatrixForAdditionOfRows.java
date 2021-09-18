//Addition of matrix
import java.util.Scanner;
public class MatrixForAdditionOfRows
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][],row,col,i,j;
		System.out.println("Enter the value of Row and column : ");
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int [row][col];
		// input the data matrix
		for(i=0;i<row;i++) 
		{
			for(j=0;j<col;j++) 
			{
				System.out.println("Enter the data of element:");
				a[i][j]=sc.nextInt();
			}
			
		}
		//print the matrix and sum of rows
		System.out.println("= ke aage Row ki addition he");
		
		for(i=0;i<row;i++) 
		{
			int sumOfR=0;
			for(j=0;j<col;j++) 
			{
				sumOfR+=a[i][j];
				System.out.print(a[i][j]+" ");
			
				
			}
			System.out.println("="+sumOfR);
			
		}
		System.out.println();
		//= ke aage column ki addition he
		for(i=0;i<col;i++) 
		{
			int sumOfC=0;
			for(j=0;j<row;j++) 
			{
				sumOfC+=a[j][i];
				System.out.print(a[j][i]+" ");
			
				
			}
			System.out.println(" Orginal matrix "+i+" column addition="+sumOfC);
			
		}
		
		
		

	}

}
