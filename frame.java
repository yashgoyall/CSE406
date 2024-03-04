import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

class frame;
public static void main(Sring...Yash)
{
JFrame f= new JFrame("Text Field application");
JButton b = new JButton("Push button");
b.setBounds(15,15,100,100);
b.setBackground(Color.red);
JPanel p= new JPanel();
p.setBounds(15,15,120,150);
p.setBackground(Color.red);
JTextField tf = new JTextField("Hello K0007b student");
tf.setBounds(20,20,100,150);
tf.setForeground(Color.white);
tf.setBackground(Color.black);
p.add(tf);

JPanel p1= new JPanel();
p1.setBounds(160,160,120,150);
p1.setBackground(Color.green);
JTextField tf1 = new JTextField("LPu vertos");
tf1.setBounds(50,50,100,150);
tf1.setForeground(Color.black);
tf1.setBackground(Color.white);
b.add.ACtion.listener(new.Action>listeneer);
p1.add(tf1);
f.add(p);
f.add(b);

f.add(p1);
f.setSiz3(500,500);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);
}
}