import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
class login_password
{
public static void main(String... shruti)
{
JFrame f=new JFrame("Login APlication");
JLabel l1=new JLabel("USERNAME");
l1.setBounds(20,20,100,30);
l1.setForeground(Color.blue);

JTextField tf = new JTextField();
tf.setBounds(90,20,100,30);
tf.setForeground(Color.black);

JLabel l2=new JLabel("Password");
l2.setBounds(20,80,100,30);
l2.setForeground(Color.red);

JPasswordField pf = new JPasswordField();
pf.setBounds(90,80,100,30);
pf.setForeground(Color.blue);

JLabel l3=new JLabel();
l3.setBounds(20,200,100,30);
l3.setForeground(Color.blue);

JButton b=new JButton("LOGIN");
b.setBounds(220,120,100,30);
b.setForeground(Color.blue);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
l3.setText("Welcome "+tf.getText() +"!");
}
});
f.add(l1);
f.add(l2);
f.add(l3);
f.add(tf);
f.add(pf);
f.add(b);
f.setSize(400,400);
f.setLocationRelativeTo(null);
f.setResizable(false);
f.getContentPane().setBackground(Color.yellow);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);
}
}