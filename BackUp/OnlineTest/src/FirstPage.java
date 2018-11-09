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
	
	public FirstPage(String s) {
		
		super(s);
		image1 = new ImageIcon(getClass().getResource("Thug Life.jpg"));
		l=new JLabel(image1);  
		add(l);
		    b1=new JButton("Quiz");  
	        b2=new JButton("Organize your Tasks");  
	       
	      
	       
	        b1.addActionListener(this);  
	        b2.addActionListener(this);  
	        
	        
	        add(b1);add(b2); 
	        
	        l.setBounds(30,40,450,20);  
	        
	     
	        b1.setBounds(100,200,100,100);  
	        b2.setBounds(270,200,200,100);  
	       
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setLayout(null);  
	        setLocation(250,100);  
	        setVisible(true);  
	        setSize(600,350);  
	}
	public void actionPerformed(ActionEvent e) {
		

    	if(e.getSource()==b1)  
        {  
            option=1;
            new MainFrame("QUIZ");
            dispose();
            
           
        } 
    	if(e.getSource()==b2)  
        {  
            option=2;
            new ToDo("Organize");
            dispose();
          
        }
    	
	}
	
    public static void main(String[] args) {
		
    	new FirstPage("Student Mate");
	}


}
