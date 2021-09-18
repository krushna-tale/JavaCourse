import javax.swing.*;

import java.awt.*;



class MyTabbedPane extends JFrame
{
	JPanel p1,p2,p3,p4,p5;
	JButton b1,b2,b3,b4,b5;
	JTabbedPane jt;
	
	public MyTabbedPane() 
	{
		super("Tabbed pane example");
		
		p1=new JPanel();p2=new JPanel();p3=new JPanel();p4=new JPanel();p5=new JPanel();
		b1=new JButton("One");b2=new JButton("Two");b3=new JButton("Three");b4=new JButton("Four");b5=new JButton("five");
		p1.add(b1);p2.add(b2);p3.add(b3);p4.add(b4);p5.add(b5);
		
		jt =new JTabbedPane();
		
		jt.addTab("First Tab",p1);jt.addTab("Second Tab",p2);jt.addTab("Third Tab",p3);jt.addTab("Fourth Tab",p4);jt.addTab("Fifth Tab",p5);
		
		add(jt);
		setSize(600,500);
		setVisible(true);
	}
	
}
public class TabbedPaneLayout {
	public static void main(String args[]) {
		MyTabbedPane tb=new MyTabbedPane();
	}
	
}
