/*Online Java Paper Test*/  
  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
public class EVS extends JFrame implements ActionListener  
{  
	ImageIcon image1;
    JLabel l,l2;
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10]; 
    Font caption = new Font("Helvlight", Font.BOLD,14);
    
    EVS(String s)  
    {  
        super(s); 
        image1 = new ImageIcon(getClass().getResource("leaves.jpg"));
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
        
        b1.setFont(caption);
        b2.setFont(caption);
        l.setFont(caption);
        
        l.setBounds(30,40,750,50);  
        l2.setBounds(470, 0, 500, 300);
        jb[0].setBounds(50,80,400,30);  
        jb[1].setBounds(50,110,400,30);  
        jb[2].setBounds(50,140,400,30);  
        jb[3].setBounds(50,170,400,30);  
        b1.setBounds(35,240,200,40);  
        b2.setBounds(245,240,200,40);  
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(460,280);  
        setVisible(true);  
        setSize(1000,400); 
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==4)  
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
            if(current==4)  
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
            l.setText("Que1: What percentage of land area should remain covered by forest to maintain Ecological balance?");  
            jb[0].setText("10%");jb[1].setText("33%");jb[2].setText("5%");jb[3].setText("None of the above");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: What is the full form of BOD?");  
            jb[0].setText("Biological Ozone Demand");jb[1].setText("Biological Oxygen Demand");jb[2].setText("Bonded Oxygen Demand");jb[3].setText("None of the above");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: How much percentage of nitrogen consist in Earth's Atmosphere?");  
            jb[0].setText("25%");jb[1].setText("12%");jb[2].setText("92%");jb[3].setText("78%");  
        }  
        if(current==3)  
        {  
            l.setText("Que4: The disease Itai Itai is caused by?");  
            jb[0].setText("Manganese");jb[1].setText("Carbon");jb[2].setText("Cadmium");jb[3].setText("Ammonia");  
        }  
        if(current==4)  
        {  
            l.setText("Que5: When was the Environment Protection Act formulated?");  
            jb[0].setText("1980");jb[1].setText("1991");jb[2].setText("1986");jb[3].setText("1975");  
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
            return(jb[1].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[2].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());  
         
        return false;  
    }  
    public static void main(String s[])  
    {  
        new EVS("Test your EVS skills");  
    }  
}  