import javax.swing.*;
import java.awt.*;

class dataForm
{
	JFrame fr;
	JPanel pan;
	JLabel lname,lage;
	JTextField tname,tage;
	JButton Submit,Cancel,Reload;
	

public dataForm()
{
     fr=new JFrame("Make your payment");
     pan=new JPanel();
     lname =new JLabel("Enter your Name");
     lage =new JLabel("Enter your Age");
     tname =new JTextField(20);
     tage =new JTextField(4);
     Submit=new JButton("Submit");
     Cancel=new JButton("Cancel");
     Reload=new JButton("Reload");
    
     
     pan.add(lname);pan.add(tname);
     pan.add(lage);pan.add(tage);
     pan.add(Submit);pan.add(Reload);
     pan.add(Cancel);
     
     fr.add(pan);
     fr.setSize(500,500);
     fr.setVisible(true);       //to show panel
     
     
			
}
}
public class Program1 {

	public static void main(String[] args)
	{
	 dataForm d1=new dataForm();

	}

}
