//package QuizApplication;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField ename;
    Login(){
        getContentPane().setBackground(new Color(89, 10, 122));
        setLayout(null);

        // ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("login.png"));
        // JLabel image=new JLabel(i1);
        // image.setBounds(0, 0, 600, 500);
        // add(image);

        JLabel heading=new JLabel("SMART MINDS");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,35));
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel name =new JLabel("Enter your Name");
        name.setBounds(810, 50, 300, 200);
        name.setFont(new Font("Century Gothic",Font.PLAIN,18));
        name.setForeground(Color.WHITE);
        add(name);

        ename=new JTextField();
        ename.setFont(new Font("Times New Roman", Font.PLAIN,20));
        ename.setBounds(735, 200, 300, 25);
        add(ename);

        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setLocation(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == rules){
            String name=ename.getText();
            setVisible(false);
            new Rules(name);
        } if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
    new Login();
    }
}

