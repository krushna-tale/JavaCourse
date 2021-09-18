import javax.swing.*;
import java.awt.*;  
 
class BoxLayoutExample1 extends JFrame { 
	JPanel pan;
	BoxLayout bx;
    JButton buttons[];  
  
 public BoxLayoutExample1 () 
{  
	     super("BoxLayout Example");
	     pan=new JPanel();
	     add(pan);
         buttons = new JButton [5];  
    
   for (int i = 0;i<5;i++) {  
         buttons[i] = new JButton ("Button " + (i + 1));  
         pan.add (buttons[i]);  
}  
  
         bx=new BoxLayout (pan, BoxLayout.Y_AXIS);  
         pan.setLayout(bx);
         setSize(400,400); 
         setLocationRelativeTo(null);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setVisible(true);  
} 
} 
  public class BoxLayoutEx{
	  
      public static void main(String args[]){  
         BoxLayoutExample1 bl=new BoxLayoutExample1();  
}  
}
 