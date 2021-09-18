import javax.swing.*;
import java.awt.event.*;

class DetaForm extends JFrame implements ActionListener
{
	JPanel pan;
	JLabel lname,lcity,lmobile,loutput;
	JTextField tname,tcity,tmobile;
	JButton submit,reset;
	String 
	public DetaForm()
	{
		super("Account Form");
		pan=new JPanel();
		pan.setLayout(null);
		add(pan);
		
		lname=new JLabel("Enter Name ");	lcity=new JLabel("Enter City ");	lmobile=new JLabel("Mobile No ");
		tname=new JTextField();	tcity=new JTextField();	lmobile=new JTextField();
		submit=new JButton("Submit");reset=new JButton("Reset");
		loutput=new JLabel();
		
		
		
	}
	
	
	
}
public class BankForm {
}
