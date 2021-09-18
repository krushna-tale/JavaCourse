// setBounds() function example
import javax.swing.*;
import java.awt.event.*; // import event package - step 1

class MyBioData2 extends JFrame implements ActionListener // step - 2 implement ActionListener interface
{
	JPanel pan;
	JLabel lname, lage, lcity;
	JTextField tname, tage, tcity;
	
	JLabel output;
	
	JButton ok, cancel;
	
	public MyBioData2()
	{
		super("Setbounds example with event handling");
		pan = new JPanel();
		pan.setLayout(null); // remove layout from panel - flowlayout
		add(pan);
		
		lname = new JLabel("Enter Name : "); lage = new JLabel("Enter Age : "); lcity= new JLabel("Enter City :");
		tname = new JTextField(20); tage = new JTextField(5); tcity = new JTextField(20);
		ok = new JButton("SUBMIT"); cancel = new JButton("CANCEL");
		output = new JLabel("---- Output Label ----");
		
		//
		// x = 20, y = 20, w = 80, h = 20
		lname.setBounds(10, 10, 80, 20); pan.add(lname);
		tname.setBounds(100, 10, 100, 20); pan.add(tname);
		
		lage.setBounds(10, 40, 80, 20); pan.add(lage);
		tage.setBounds(100, 40, 100, 20); pan.add(tage);
		
		lcity.setBounds(10, 70, 80, 20); pan.add(lcity);
		tcity.setBounds(100, 70, 100, 20); pan.add(tcity);
		
		ok.setBounds(50, 120, 100, 20); pan.add(ok);
		cancel.setBounds(200,120, 100, 20); pan.add(cancel);
		
		ok.addActionListener(this); // register event on the button -- step - 3
		cancel.addActionListener(this); // buttons are active
		
		output.setBounds(50, 200, 300, 20); pan.add(output);
				
		setSize(600,600);
		setLocationRelativeTo(null);// display fraem at the center of screen
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent evt) // event handler function e should contain either ok or cancel
	{
		if (evt.getSource() == ok)
		{
			String name, age, city;
			name = tname.getText();
			age = tage.getText();
			city = tcity.getText();
			output.setText("Name is "+name+"   "+"Age is "+age+"    "+city);
		}
		else
		{
			tname.setText("");
			tage.setText("");
			tcity.setText("");
			output.setText("----- Output Label -----");
		}
	}
}
public class ActionEventExample
{
	public static void main(String args[])
	{
		MyBioData2 mb = new MyBioData2();
	}
}