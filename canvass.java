import javax.swing.*; 
import java.awt.Graphics; 
import java.awt.Color; 
import java.awt.Font; 
import java.awt.*; 
class ke007demo extends Canvas 
{ 
public void paint(Graphics g) 
{ 
Font font=new Font("Dialog",Font.BOLD,22); 
g.setFont(font); 
g.drawString("Yash",30,20); 
setForeground(Color.blue); 
setBackground(Color.yellow); 
g.drawString("Students",40,50); 
g.fillRect(70,60,150,90); 
g.drawOval(180,180,200,100); 
g.drawArc(20,150,70,20,30,90); 
g.fillArc(60,160,100,100,130,120); 
g.fillOval(90,200,150,100); 
} 
public static void main(String args[]) 
{ 
ke007demo d=new ke007demo(); 
JFrame f=new JFrame("KeyEvent application"); 
f.add(d); 
f.setSize(400,400); 
f.setResizable(false); 
f.setLocationRelativeTo(null); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//f.setLayout(null); 
f.setVisible(true); 
} 
}