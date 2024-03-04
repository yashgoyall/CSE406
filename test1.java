


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


class test1 implements KeyListener{

    JFrame f;
    JLabel l;
    JTextArea ta;

    test1()
    {
        f = new JFrame("KeyEvent Application");
        l = new JLabel();

        l.setBounds(180,120,200,30);
        l.setForeground(Color.white);
        ta = new JTextArea();
        ta.setBounds(50,30,300,100);
        ta.addKeyListener(this);
        f.add(l);
        f.add(ta);
        f.setSize(400,400);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(89,129,110));
        f.setLayout(null);
        f.setVisible(true);
    }

    public void keyPressed(KeyEvent e)
    {
        l.setText("Key Presses event");
    }

    public void keyReleased(KeyEvent e)
    {
        l.setText("Key Released event");
    }

    public void keyTyped(KeyEvent e)
    {
        l.setText("Key Types event");
    }

    public static void main(String args[])
    {
        new test1();
    }

}