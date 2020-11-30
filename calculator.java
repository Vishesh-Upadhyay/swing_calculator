import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class calculator extends JFrame implements ActionListener
{
	JFrame f = new JFrame();;
	JLabel l1;
	JButton b1,b2,b3,b4,b5;
	JTextField t1;
	JTextField t2;
	JRadioButton r1,r2;
	public calculator()
	{
    //f = new JFrame();
    l1= new JLabel(" RESULT: ");
	b1 = new JButton(" ADD+ ");
	b2 = new JButton(" sub- ");
	b3 = new JButton(" Mul * ");
	b4 = new JButton(" Div / ");
	b5 = new JButton(" Rate ");
    t1= new JTextField(10);
	t2= new JTextField(10);
	r1 = new JRadioButton(" LIKED IT ");
	r2 = new JRadioButton(" DID NOT LIKED IT ");
    f.setSize(400,400);
	f.setVisible(true);
	f.setLayout(new FlowLayout());
	f.add(t1);
	f.add(t2);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(l1);
	f.add(r1);
	f.add(r2);
	f.add(b5);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	ButtonGroup bg = new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	}
	public static void main (String args[])
	{
		calculator c = new calculator();
	}
    public void actionPerformed(ActionEvent ae)
	{
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
        int value; 
		String str;
		 if(ae.getSource()==b1)
		 {
		 value = num1 + num2;
		 l1.setText(value + "");
		 }
		 if(ae.getSource()==b2)
		 {
		 value = num1 - num2;
		 l1.setText(value + "");
		 }
		 if(ae.getSource()==b3)
		 {
		 value = num1 * num2;
		 l1.setText(value + "");
		 }
		 if(ae.getSource()==b4)
		 {
		 value = num1 / num2;
		 l1.setText(value + "");
		 }
		 if(ae.getSource()==b5)
		 {
		 if(r1.isSelected())
		 {
			  str = " Thankyou so much ";
			 l1.setText(str);
		 }
		 if(r2.isSelected())
		 {
			  str = " I will try harder ";
		      l1.setText(str);
		 }
		 }		 
	}
}	
