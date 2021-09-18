import java.util.Scanner;
public class MatrixProgram1
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
		//print the matrix
		for(i=0;i<row;i++) 
		{
			for(j=0;j<col;j++) 
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
		

	}

}
