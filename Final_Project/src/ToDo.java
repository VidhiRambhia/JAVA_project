
// To-do List

import javax.swing.*; // JFrame and components 
import java.awt.*; // for Font class(es)
import java.awt.event.*; // for actionListeners
import java.util.Random; // for image idices picked randomly
import java.util.Scanner;
import java.io.*;

public class ToDo extends JFrame implements ActionListener
{ 
	// all Swing variables are (implicitly) declared static/global since they are just indicators for actual data they point to
    // (components remain the same throughout the program)
	JLabel l, l2;  
    JCheckBox cb1,cb2,cb3;  
    JButton b;  
    JTextField tf1, tf2, tf3;
	ImageIcon i[] = new ImageIcon[16];
	JLabel il[] = new JLabel[16];
    
    int more, n=0;
    Random rand = new Random();
    static String name="";
    Scanner s = new Scanner(System.in);
    
    ToDo(String name) // constructor
    {
    	// image arsenal 
    	
    	i[0] = new ImageIcon(getClass().getResource("birthday.jpg"));
    	il[0] = new JLabel(i[0]);
    	il[0].setBounds(0,0,500, 200);
    	
    	i[1] = new ImageIcon(getClass().getResource("books.jpg"));
    	il[1] = new JLabel(i[1]);
    	il[1].setBounds(0,0,500, 200);
    	
    	i[2] = new ImageIcon(getClass().getResource("bowling.jpg"));
    	il[2] = new JLabel(i[2]);
    	il[2].setBounds(0,0,500, 200);
    	
    	i[3] = new ImageIcon(getClass().getResource("breakfast.jpg"));
    	il[3] = new JLabel(i[3]);
    	il[3].setBounds(0,0,500, 200);
    	
    	i[4] = new ImageIcon(getClass().getResource("coffee.jpg"));
    	il[4] = new JLabel(i[4]);
    	il[4].setBounds(0,0,500, 200);
    	
    	i[5] = new ImageIcon(getClass().getResource("desk.jpg"));
    	il[5] = new JLabel(i[5]);
    	il[5].setBounds(0,0,500, 200);
    	
    	i[6] = new ImageIcon(getClass().getResource("dinner.jpg"));
    	il[6] = new JLabel(i[6]);
    	il[6].setBounds(0,0,500, 200);
    	
    	i[7] = new ImageIcon(getClass().getResource("fair.jpg"));
    	il[7] = new JLabel(i[7]);
    	il[7].setBounds(0,0,500, 200);
    	
    	i[8] = new ImageIcon(getClass().getResource("fireworks.jpg"));
    	il[8] = new JLabel(i[8]);
    	il[8].setBounds(0,0,500, 200);
    	
    	i[9] = new ImageIcon(getClass().getResource("game.jpg"));
    	il[9] = new JLabel(i[9]);
    	il[9].setBounds(0,0,500, 200);
    	
    	i[10] = new ImageIcon(getClass().getResource("leaves.jpg"));
    	il[10] = new JLabel(i[10]);
    	il[10].setBounds(0,0,500, 200);
    	
    	i[11] = new ImageIcon(getClass().getResource("marathon.jpg"));
    	il[11] = new JLabel(i[11]);
    	il[11].setBounds(0,0,500, 200);
    	
    	i[12] = new ImageIcon(getClass().getResource("pizza.jpg"));
    	il[12] = new JLabel(i[12]);
    	il[12].setBounds(0,0,500, 200);
    	
    	i[13] = new ImageIcon(getClass().getResource("pool.jpg"));
    	il[13] = new JLabel(i[13]);
    	il[13].setBounds(0,0,500, 200);
    	
    	i[14] = new ImageIcon(getClass().getResource("tie.jpg"));
    	il[14] = new JLabel(i[14]);
    	il[14].setBounds(0,0,500, 200);
    	
    	i[15] = new ImageIcon(getClass().getResource("traffic.jpg"));
    	il[15] = new JLabel(i[15]);
    	il[15].setBounds(0,0,500, 200);
    	
    	// image arsenal ends
    	
    	
    	System.out.println("Enter your name");
    	name = s.nextLine();
    	// initializing required font styles
    	Font prompt = new Font("Helvlight", Font.BOLD, 25);
    	Font description = new Font("Helvlight", Font.BOLD, 18);
    	Font caption = new Font("Helvlight", Font.BOLD, 14);
    	
    	// adding  labels and descriptions
        name = name.toUpperCase();
        l=new JLabel(name+"'S TASKS");
        l.setFont(prompt);
        l.setBounds(150,165,300,20);  
        l2 = new JLabel("List the three most important things you plan on finishing today");
        l2.setFont(caption);
        l2.setBounds(15,188,600,20);
        
        // three checkboxes for three tasks; a textfield for each. 
        // aiming to centrally align them all; adjusting dimensions accordingly
        cb1=new JCheckBox("Task 1"); 
        cb1.setFont(description); 
        cb1.setBounds(50,215,90,50);  
        tf1 = new JTextField();
        tf1.setBounds(150,215,300,55);
        
        cb2=new JCheckBox("Task2");  
        cb2.setFont(description);
        cb2.setBounds(50,275,90,50); 
        tf2 = new JTextField();
        tf2.setBounds(150,275,300,55);
        
        cb3=new JCheckBox("Task3");  
        cb3.setFont(description);
        cb3.setBounds(50,335,90,50);
        tf3 = new JTextField();
        tf3.setBounds(150,335,300,55); 
        
        // 'submit' button
        b=new JButton("Done!");
        b.setFont(prompt);
        b.setBounds(175,415,200,40);  
        b.addActionListener(this);  
        
        // adding all components to the frame
        add(l); add(l2);
        n = rand.nextInt(15);
        add(il[n]);
        add(il[0]);
        add(cb1); add(cb2); add(cb3);
        add(tf1);add(tf2);add(tf3);
        add(b);
        
        // frame size. The method is called directly since the 'this' object is implicitly referred to inside the constructor
        setSize(520,525); 
        setTitle(name);
        setLayout(null);  
        setLocation(690,250); 
        setVisible(true);  // frame visible hai (how stupid)
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    
    public void actionPerformed(ActionEvent e)
    {  
        System.out.println(n);
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
    
    public static void main(String[] args)
    {  
        new ToDo(name);  
    }  
}
