import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstPage  extends JFrame implements ActionListener {

	JButton b1,b2;
	ImageIcon image1;
	JLabel l;
	int option=0;
	Font caption = new Font("Helvlight", Font.BOLD, 16);
	
	public FirstPage(String s)
	{
			
			super(s);
			image1 = new ImageIcon(getClass().getResource("logo.png"));
			l=new JLabel(image1); 
			add(l);
		    b1=new JButton("Take a quiz");  
		    b1.addActionListener(this); 
		    b1.setFont(caption);
	        
		    b2=new JButton("List today's tasks");  
	        b2.addActionListener(this);  
	        b2.setFont(caption);

	        add(b1);add(b2); 
	        
	        l.setBounds(0,5,730,260);  
	        
	        b1.setBounds(120,300,250,80);  
	        b2.setBounds(370,300,250,80);  
	       
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setLayout(null);  
	        setLocation(640,300);  
	        setVisible(true);  
	        setSize(740,500);  
	}
	public void actionPerformed(ActionEvent e) {
		

    	if(e.getSource()==b1)  
        {  
            option=1;
            new MainFrame("Revise a bit:\n Take a quiz!");
            
           
        } 
    	if(e.getSource()==b2)  
        {  
            option=2;
            new ToDo("");
          
        }
    	
	}
	
    public static void main(String[] args) {
		
    	new FirstPage("NVision");
	}


}
