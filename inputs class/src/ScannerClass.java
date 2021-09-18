import java.util.Scanner;
public class ScannerClass {
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	int ht=0;
	float ba=0,area;
	System.out.print("Enter the Height and Base");
	ht=in.nextInt();
	ba=in.nextFloat();
	area=(ba/2.0f)*ht;
	System.out.println("Height is ="+ht+" \nBase ="+ba+" \nArea is = "+area);
	
	}

}
