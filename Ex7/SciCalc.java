import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SciCalc {
    static JPanel buttonPanel= new JPanel(new GridLayout(4,4));
    static JTextField output= new JTextField();
    public static void main(String[] args) {
        JFrame jf= new JFrame("SciCalc");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(200,200,500,500);
        jf.setLayout(new BorderLayout());
        output.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jf.add(output, BorderLayout.NORTH);
        jf.add(buttonPanel, BorderLayout.CENTER);
        int num= 9;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j<3){
                    if(i==3){
                        if(j==0) { buttonAdder("C"); continue; }
                        if(j==2) { buttonAdder("."); continue;}
                    }
                    buttonAdder(num);
                    num--;
                }
                else{
                    if(i==0) buttonAdder("sin");
                    if(i==1) buttonAdder("cos");
                    if(i==2) buttonAdder("log");
                    if(i==3) buttonAdder("sqrt");
                }
            }
        }
        jf.setVisible(true);
    }
    static void buttonAdder(String data){
        JButton button= new JButton(data);
        button.setFont(new Font("Tahoma", Font.PLAIN, 20));
        if(data.equals("C")){
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    output.setText("");
                }
            });
        }
        if(data.equals("log")){
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    output.setText(Double.toString((Math.log(Double.parseDouble(output.getText())))));
                }
            });
        }
        if(data.equals("sqrt")){
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    output.setText(Double.toString(Math.sqrt(Double.parseDouble(output.getText()))));
                }
            });
        }
        if(data.equals("sin")){
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    output.setText(Double.toString(Math.sin(Double.parseDouble(output.getText()))));
                }
            });
        }
        if(data.equals("cos")){
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    output.setText(Double.toString(Math.cos(Double.parseDouble(output.getText()))));
                }
            });
        }
        if(data.equals(".")){
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    output.setText(output.getText()+".");
                }
            });
        }
        buttonPanel.add(button);
    }
    static void buttonAdder(int data){
        JButton button= new JButton(Integer.toString(data));
        button.setFont(new Font("Tahoma",Font.BOLD, 20));
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                output.setText(output.getText()+Integer.toString(data));
            }
        });
        buttonPanel.add(button);
    }
}