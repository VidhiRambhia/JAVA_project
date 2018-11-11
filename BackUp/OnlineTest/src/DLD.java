
/*Online Java Paper Test*/  
  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
public class DLD extends JFrame implements ActionListener  
{  
	ImageIcon image1;
    JLabel l,l2;
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    DLD(String s)  
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
        setSize(500,400);  
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
            l.setText("Que1: Which is a read only memory?");  
            jb[0].setText("ROM");jb[1].setText("EPROM");jb[2].setText("RAM");jb[3].setText("Registers");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: How many states does a decimal counter have?");  
            jb[0].setText("5");jb[1].setText("10");jb[2].setText("15");jb[3].setText("20");  
        }  
        if(current==2)  
        {  
            l.setText("Que3:How many BCD counters does a three decade counter have ?");  
            jb[0].setText("2");jb[1].setText("3");jb[2].setText("4");jb[3].setText("5");  
        }  
        if(current==3)  
        {  
            l.setText("Que4: Simplest Registers consist only of");  
            jb[0].setText("counter");jb[1].setText("EPROM");jb[2].setText("latch");jb[3].setText("flip-flop");  
        }  
        if(current==4)  
        {  
            l.setText("Que5: Ripple counters are also called");  
            jb[0].setText("SSI counters");jb[1].setText("asynchronous counters");jb[2].setText("synchronous counters");jb[3].setText("VLSI counters");  
        }  
        if(current==5)  
        {  
            l.setText("Que6: First operator precedence for evaluating Boolean expressions is?");  
            jb[0].setText("paranthesis");jb[1].setText("AND");jb[2].setText("OR");jb[3].setText("NOT");  
        }  
        if(current==6)  
        {  
            l.setText("Que7: What is x.x equal to?");  
            jb[0].setText("x");jb[1].setText("1");jb[2].setText("0");  
                        jb[3].setText("x'");  
        }  
        if(current==7)  
        {  
            l.setText("Que8: Which of these represents AND operation?");  
            jb[0].setText("+");jb[1].setText("/");jb[2].setText(".");  
                        jb[3].setText("*");         
        }  
        if(current==8)  
        {  
            l.setText("Que9: Which of these represents OR operation?");  
            jb[0].setText("+");jb[1].setText("/");jb[2].setText(".");jb[3].setText("*");  
        }  
        if(current==9)  
        {  
            l.setText("Que10: What is x+x'?");  
            jb[0].setText("0");jb[1].setText("1");jb[2].setText("x");  
                        jb[3].setText("x'");  
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
    public static void main(String s[])  
    {  
        new DLD("Test your DLD skills!");  
    }  
}  