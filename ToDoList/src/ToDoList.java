// To-do List

import javax.swing.*; // JFrame and components 
import java.awt.*; // for Font class(es)
import java.awt.event.*; // for actionListeners

public class ToDoList extends JFrame implements ActionListener
{ 
	// all Swing variables are (implicitly) declared static/global since they are just indicators for actual data they point to
    // (components remain the same throughout the program)
	JLabel l, l2;  
    JCheckBox cb1,cb2,cb3;  
    JButton b;  
    JTextField tf1, tf2, tf3;
    
    int more;
    
    ToDoList() // constructor
    {
    	// initializing required font styles
    	Font prompt = new Font("Helvlight", Font.BOLD, 25);
    	Font description = new Font("Helvlight", Font.BOLD, 18);
    	Font caption = new Font("Helvlight", Font.BOLD, 14);
    	
    	// adding  labels and descriptions
        l=new JLabel("TASKS");
        l.setFont(prompt);
        l.setBounds(300,50,300,20);  
        l2 = new JLabel("List the three most important things you plan on finishing today");
        l2.setFont(caption);
        l2.setBounds(100,73,600,20);
        
        // three checkboxes for three tasks; a textfield for each. 
        // aiming to centrally align them all; adjusting dimensions accordingly
        cb1=new JCheckBox("Task 1"); 
        cb1.setFont(description); 
        cb1.setBounds(100,100,90,50);  
        tf1 = new JTextField();
        tf1.setBounds(200,100,300,55);
        
        cb2=new JCheckBox("Task2");  
        cb2.setFont(description);
        cb2.setBounds(100,160,90,50); 
        tf2 = new JTextField();
        tf2.setBounds(200,160,300,55);
        
        cb3=new JCheckBox("Task3");  
        cb3.setFont(description);
        cb3.setBounds(100,220,90,50);
        tf3 = new JTextField();
        tf3.setBounds(200,220,300,55); 
        
        // 'submit' button
        b=new JButton("Done!");
        b.setFont(prompt);
        b.setBounds(225,300,200,40);  
        b.addActionListener(this);  
        
        // adding all components to the frame
        add(l); add(l2);
        add(cb1); add(cb2); add(cb3);
        add(tf1);add(tf2);add(tf3);
        add(b);
        
        // frame size. The method is called directly since the 'this' object is implicitly referred to inside the constructor
        setSize(700,500);  
        setLayout(null);  
        setVisible(true);  // frame visible hai (how stupid)
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    
    public void actionPerformed(ActionEvent e)
    {  
        String s="";
        more=0;
        if(cb1.isSelected())
        { 
            s = s + "Task 1: " + tf1.getText() + "\n";
            tf1.setText("");
            cb1.setSelected(false);
            more++;
        }  
        
        if(cb2.isSelected())
        {  
        	s = s + "Task 2: " + tf2.getText() + "\n";
        	tf2.setText("");
        	cb2.setSelected(false);
        	more++;
        }  
        
        if(cb3.isSelected())
        {  
        	s = s + "Task 3: " + tf3.getText() + ".";
        	tf3.setText("");
        	cb3.setSelected(false);
        	more++;
        }   
        
        JOptionPane.showMessageDialog(this,"Great job.\nTasks completed:\n\n"+s+"\n\nYou have "+(3-more)+" tasks left to do.");  
    }  
    
    public static void main(String[] args) {  
        new ToDoList();  
    }  
} 