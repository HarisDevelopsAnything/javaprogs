import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Prime{
    public static void main(String[] args) {
        JFrame jf= new JFrame();
        jf.setTitle("Check Prime");
        jf.setBounds(50,50,350,125);
        jf.setLayout(new BorderLayout());
        JPanel jp= new JPanel();
        JTextField input= new JTextField(6);
        JLabel inputLabel= new JLabel("Enter the number:");
        JButton calc= new JButton("Check");
        jp.add(inputLabel);
        jp.add(input);
        jf.add(jp, BorderLayout.NORTH);
        jf.add(calc, BorderLayout.CENTER);
        calc.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
                int n= Integer.parseInt(input.getText());
                if(isPrime(n)){
                    JOptionPane.showMessageDialog(null, "Number is prime!");
                }
                else
                JOptionPane.showMessageDialog(null, "Number is not prime!");
           } 
        });
        jf.setVisible(true);
        
    }
    static boolean isPrime(int in){
        for(int i=2;i<in/2;i++){
            if(in%i == 0){
                return false;
            }
        }
        return true;
    }
}