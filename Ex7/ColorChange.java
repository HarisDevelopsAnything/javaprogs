import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ColorChange {
    public static void main(String[] args) {
        JFrame jf= new JFrame();
        jf.setTitle("Text color changer");
        jf.setBounds(500,500,600,600);
        jf.setLayout(new BorderLayout());
        JLabel heading= new JLabel("Enter your text, and select a color!");
        heading.setFont(new Font("Ubuntu Sans", Font.BOLD, 20));
        jf.add(heading, BorderLayout.NORTH);
        JPanel center= new JPanel(new GridLayout(10,1));
        jf.add(center, BorderLayout.CENTER);

        JPanel row1= new JPanel();
        row1.setSize(600, 100);
        JTextField input= new JTextField(20);
        JLabel label= new JLabel("Your text will appear here!");
        input.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e){
       //         label.setText(input.getText());
            }
            public void keyTyped(KeyEvent e){

            }
            public void keyReleased(KeyEvent e){
                if(input.getText().length()!=0)
                label.setText(input.getText());
                else
                label.setText("Your text will appear here!");
            }
        });
        
        label.setFont(new Font("",Font.PLAIN, 30));
        row1.add(input);

        JPanel row2= new JPanel();
        JButton red= new JButton("Red");
        JButton green= new JButton("Green");
        JButton blue= new JButton("Blue");

        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setForeground(new Color(255,0,0));
            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setForeground(new Color(0,255,0));
            }
        });
        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setForeground(new Color(0,0,255));
            }
        });
        row2.add(red);
        row2.add(green);
        row2.add(blue);
        center.add(row1);
        center.add(label);
        center.add(row2);
        jf.setVisible(true);
    }
}
