// Java program to create frames 
// using association 
import java.awt.event.*;
import javax.swing.*; 
class Test1 extends JFrame implements ActionListener
{ 
	static JFrame frame; 
	static JLabel l;
	static JButton button;
	static JTextField tfinput, tfoutput;
	Test1() 
	{ 
	} 
	
	public static void main(String[] args) 
	{ 

		// creating instance of JFrame with name "first way" 
		frame=new JFrame("Interpreter"); 
		
		// creates instance of JButton 
		button = new JButton("Click karo"); 
		
		// makes the frame visible 
		frame.setVisible(true); 
		
		Test1 obj = new Test1(); 
		l = new JLabel("write expression here");
		button.addActionListener(obj);
		tfinput = new JTextField(20);
		tfoutput = new JTextField(20);
		JPanel p = new JPanel();

		p.add(button);
		p.add(l);
		p.add(tfinput);
		p.add(tfoutput);
		frame.add(p);
		frame.setSize(500, 300);
	
	} 
	
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		String ip = tfinput.getText();
		System.out.println(ip);
		String op = " ";
		if (s.equals("Click karo"))
		{
			int l=(ip.length())-1;
			while(l>=0)
			{
				op = op.concat((Character.toString(ip.charAt(l))));
				System.out.println(op);
				l--;
			}
			tfoutput.setText(op);
			tfinput.setText(" ");
		}
	}
} 
