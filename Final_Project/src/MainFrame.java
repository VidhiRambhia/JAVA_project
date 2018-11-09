import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame  extends JFrame implements ActionListener {

	JButton b1,b2,b3,b4;
	ImageIcon image1;
	JLabel l;
	int option=0;
	
	public MainFrame(String s) {
		
		super(s);
		image1 = new ImageIcon(getClass().getResource("Thug Life.jpg"));
		l=new JLabel(image1);  
		add(l);
		    b1=new JButton("PDOOP");  
	        b2=new JButton("Data Structures");  
	        b3= new JButton("DLD");
	        b4=new JButton("EVS"); 
	      
	       
	        b1.addActionListener(this);  
	        b2.addActionListener(this);  
	        b3.addActionListener(this);
	        b4.addActionListener(this);
	        
	        add(b1);add(b2); add(b3); add(b4); 
	        
	        l.setBounds(30,40,450,20);  
	        
	     
	        b1.setBounds(100,200,100,100);  
	        b2.setBounds(270,200,200,100);  
	        b3.setBounds(100,50,100,100);  
	        b4.setBounds(270,50,100,100); 
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
            new JAVA("JAVA QUIZ");
            dispose();
            
           
        } 
    	if(e.getSource()==b2)  
        {  
            option=2;
            new DS("Data Structures' QUIZ");
            dispose();
          
        }
    	
    	if(e.getSource()==b3)  
        {  
    		option=3;
            new DLD("DLD QUIZ");
            dispose();
              
        }
    	if(e.getSource()==b4)  
        {  
    		option=4;
            new EVS("EVS QUIZ");
            dispose();
            
        }
	}
	
    public static void main(String[] args) {
		
    	new MainFrame("Let's quiz");
	}


}
