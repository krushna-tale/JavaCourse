import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferReaderClass {
public static void main(String args[])throws Exception
{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int ht=0,ba=0;
	float area;
	System.out.println("Enter the Height and Base");
	ht= Integer.parseInt(in.readLine());
	ba=Integer.parseInt(in.readLine());
	
	area=(ba/2.0f)*ht;
	System.out.println(" Height is = " +ht+ " Base = " +ba+ " Area is = " +area);
	
}
}
