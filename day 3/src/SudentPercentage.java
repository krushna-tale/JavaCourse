import java.io.DataInputStream;
public class SudentPercentage {
	public static void main(String args[]) {
		

	DataInputStream in=new DataInputStream(System.in);
	int rno=0,py=0,ch=0,mth=0;
	String name="";
	System.out.println("Enter the rollno,Name,Phy mark,Che mark,Math marks");
	try
	{
		rno=Integer.parseInt(in.readLine());
		name=in.readLine();
		py=Integer.parseInt(in.readLine());
		ch=Integer.parseInt(in.readLine());
		mth=Integer.parseInt(in.readLine());

	}
	catch(Exception e)
	{
		System.out.println(" Some error " +e);
		System.exit(0);
	}
	float persentage=(py+ch+mth)/3.0f;
	
	System.out.println("Roll no " +rno+ " Name = " +name+ " Total persentage of student is =" +persentage);
	
	}
	

}
