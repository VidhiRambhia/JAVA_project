
// Java program to create frames  
// using association 
  
import javax.swing.*; // JFrame and components 
import java.awt.*; // for Font class(es)
import java.awt.event.*; // for actionListeners
import java.util.Random; // for image indices picked randomly
import java.io.*;




//Root Class

public class RootClass extends JFrame implements ActionListener
{ 
 JFrame frame; 
	static char option = 'X';
	
 RootClass() throws IOException
 { 
     // creating instance of JFrame with name "first way" 
     frame=new JFrame("APP NAME HERE"); 
       
     JButton quizButton = new JButton(new AbstractAction("Quiz") {
         @Override
         public void actionPerformed(ActionEvent e)
         {
				option = 'Q';
         }
     });
     quizButton.setBounds(200, 150, 90, 50); 
      
     JButton listButton = new JButton(new AbstractAction("To-Do List") {
         @Override
         public void actionPerformed(ActionEvent e)
         {     
         	option = 'T';
         }
     });
     listButton.setBounds(200, 300, 90, 50);
     
     // setting close operation 
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

     // adds button in JFrame 
     frame.add(quizButton); 
     frame.add(listButton);

     // sets 500 width and 600 height 
     frame.setSize(1600, 900); 
       
     // uses no layout managers 
     frame.setLayout(null); 
       
     // makes the frame visible 
     frame.setVisible(true); 
 } 
   
 
 public void actionPerformed(ActionEvent e1)
 {
 	System.out.println("Formal implementation");
 }
 
 public static void main(String[] args) throws IOException
 { 
     new RootClass(); 
		if (option=='Q')
		{
			new OnlineTest(" ");
		}
		if (option=='T')
		{
			new ToDoList();
		}
 }
} 



//To-do List

		class ToDoList extends JFrame implements ActionListener
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
		 String name="NAME";
		 ToDoList() throws IOException // constructor
		 {
			 try {
			 InputStreamReader input = new InputStreamReader(System.in);
			 BufferedReader buf = new BufferedReader(input);
			 System.out.println("Whose To-Do List is this?");
			 name = buf.readLine();
			 System.out.println("Great, thanks. Happy working.");
				
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
			 setVisible(true);  // frame visible hai (how stupid)
			 setDefaultCloseOperation(EXIT_ON_CLOSE);  
			 }
			 //catch here
			 catch (IOException e1)
			{
				System.out.println("IOException caught");
			}
		 }  
		 
		 public void actionPerformed(ActionEvent e)
		 {  
			 System.out.println(n);;
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

		 public void createList()
		 {
			//new TodoList();
		 }
		}


		 /*Online Java Paper Test*/  
		 
		 class OnlineTest extends JFrame implements ActionListener  
		 {  
		 	ImageIcon image1;
		 	JLabel l,l2;
		 	JRadioButton jb[]=new JRadioButton[5];  
		 	JButton b1,b2;  
		 	ButtonGroup bg;  
		 	int count=0,current=0,x=1,y=1,now=0;  
		 	int m[]=new int[10];      
		 	OnlineTest(String s)  
		 	{  
		 		super(s); 
		 		image1 = new ImageIcon(getClass().getResource("Thug Life.jpg"));
		 		l=new JLabel(); 
		 		l2=new JLabel(image1);  
		 		add(l2);  
		 		add(l);
		 		bg=new ButtonGroup();  
		 		for(int i=0;i<5;i++)  
		 		{  
		 			jb[i]=new JRadioButton();     
		 			add(jb[i]);  
		 			bg.add(jb[i]);  
		 		}  
		 		b1=new JButton("Next");  
		 		b2=new JButton("Bookmark");  
		 		b1.addActionListener(this);  
		 		b2.addActionListener(this);  
		 		add(b1);add(b2);  
		 		set();  
		 		l.setBounds(30,40,450,20);  
		 		l2.setBounds(400, -60, 450, 450);
		 		jb[0].setBounds(50,80,100,20);  
		 		jb[1].setBounds(50,110,100,20);  
		 		jb[2].setBounds(50,140,100,20);  
		 		jb[3].setBounds(50,170,100,20);  
		 		b1.setBounds(100,240,100,30);  
		 		b2.setBounds(270,240,100,30);  
		 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		 		setLayout(null);  
		 		setLocation(250,100);  
		 		setVisible(true);  
		 		setSize(600,350);  
		 	}  
		 	public void actionPerformed(ActionEvent e)  
		 	{  
		 		if(e.getSource()==b1)  
		 		{  
		 			if(check())  
		 				count=count+1;  
		 			current++;  
		 			set();    
		 			if(current==9)  
		 			{  
		 				b1.setEnabled(false);  
		 				b2.setText("Result");  
		 			}  
		 		}  
		 		if(e.getActionCommand().equals("Bookmark"))  
		 		{  
		 			JButton bk=new JButton("Bookmark"+x);  
		 			bk.setBounds(480,20+30*x,100,30);  
		 			add(bk);  
		 			bk.addActionListener(this);  
		 			m[x]=current;  
		 			x++;  
		 			current++;  
		 			set();    
		 			if(current==9)  
		 				b2.setText("Result");  
		 			setVisible(false);  
		 			setVisible(true);  
		 		}  
		 		for(int i=0,y=1;i<x;i++,y++)  
		 		{  
		 		if(e.getActionCommand().equals("Bookmark"+y))  
		 		{  
		 			if(check())  
		 				count=count+1;  
		 			now=current;  
		 			current=m[y];  
		 			set();  
		 			((JButton)e.getSource()).setEnabled(false);  
		 			current=now;  
		 		}  
		 		}  
		 	  
		 		if(e.getActionCommand().equals("Result"))  
		 		{  
		 			if(check())  
		 				count=count+1;  
		 			current++;  
		 			//System.out.println("correct ans="+count);  
		 			JOptionPane.showMessageDialog(this," Total Score ="+count);  
		 			System.exit(0);  
		 		}  
		 	}  
		 	void set()  
		 	{  
		 		jb[4].setSelected(true);  
		 		if(current==0)  
		 		{  
		 			l.setText("Que1: Which one among these is not a primitive datatype?");  
		 			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");   
		 		}  
		 		if(current==1)  
		 		{  
		 			l.setText("Que2: Which class is available to all the class automatically?");  
		 			jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");  
		 		}  
		 		if(current==2)  
		 		{  
		 			l.setText("Que3: Which package is directly available to our class without importing it?");  
		 			jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");  
		 		}  
		 		if(current==3)  
		 		{  
		 			l.setText("Que4: String class is defined in which package?");  
		 			jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");  
		 		}  
		 		if(current==4)  
		 		{  
		 			l.setText("Que5: Which institute is best for java coaching?");  
		 			jb[0].setText("ChitraSahu.com");jb[1].setText("Aptech");jb[2].setText("SSS IT");jb[3].setText("jtek");  
		 		}  
		 		if(current==5)  
		 		{  
		 			l.setText("Que6: Which one among these is not a keyword?");  
		 			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");  
		 		}  
		 		if(current==6)  
		 		{  
		 			l.setText("Que7: Which one among these is not a class? ");  
		 			jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");  
		 						jb[3].setText("Button");  
		 		}  
		 		if(current==7)  
		 		{  
		 			l.setText("Que8: which one among these is not a function of Object class?");  
		 			jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");  
		 						jb[3].setText("getDocumentBase");         
		 		}  
		 		if(current==8)  
		 		{  
		 			l.setText("Que9: which function is not present in Applet class?");  
		 			jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");  
		 		}  
		 		if(current==9)  
		 		{  
		 			l.setText("Que10: Which one among these is not a valid component?");  
		 			jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");  
		 						jb[3].setText("JTextArea");  
		 		}  
		 		l.setBounds(30,40,450,20);  
		 		for(int i=0,j=0;i<=90;i+=30,j++)  
		 			jb[j].setBounds(50,80+i,200,20);  
		 	}  
		 	boolean check()  
		 	{  
		 		if(current==0)  
		 			return(jb[1].isSelected());  
		 		if(current==1)  
		 			return(jb[2].isSelected());  
		 		if(current==2)  
		 			return(jb[3].isSelected());  
		 		if(current==3)  
		 			return(jb[0].isSelected());  
		 		if(current==4)  
		 			return(jb[0].isSelected());  
		 		if(current==5)  
		 			return(jb[2].isSelected());  
		 		if(current==6)  
		 			return(jb[1].isSelected());  
		 		if(current==7)  
		 			return(jb[3].isSelected());  
		 		if(current==8)  
		 			return(jb[1].isSelected());  
		 		if(current==9)  
		 			return(jb[2].isSelected());  
		 		return false;  
		 	}  
		 
		 	public void createQuiz()
		 	{
		 		//new OnlineTest();
		 	}
		 }

