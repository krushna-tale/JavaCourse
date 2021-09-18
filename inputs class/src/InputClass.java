import java.io.DataInputStream;

public class InputClass {
	public static void main(String args[]) {
		DataInputStream in=new DataInputStream(System.in);//System.in means Keyboard device
		int ht=0,ba=0;
		System.out.println("Enter the Height and Base");
		try
		{
			ht=Integer.parseInt(in.readLine());
			ba=Integer.parseInt(in.readLine());

		}
		catch(Exception ex)
		{
			System.out.println("Some Error "+ex);
			System.exit(0);
		}
		float area;
		area=(ba/2.0f)*ht;
		System.out.println("Height ="+ht+ " Base ="+ba+ " Area of Triangle ="+area);
	} 

}
