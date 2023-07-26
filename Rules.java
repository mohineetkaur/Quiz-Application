//import QuizApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("Welcome " + name + " to Smart Minds!");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
                "<html>"+
            "1. The participants shall not be allowed to use mobile or other electronic instruments during the quiz time." + "<br><br>" +
            "2. The questions shall be in the form of multiple choice." + "<br><br>" +
            "3. Replacement of any participant of a team is not allowed after registration." + "<br><br>" +
            "4. Time limit: 25 minutes." + "<br><br>" +
            "5. Each question will carry 1 mark." + "<br><br>" +
            "</html>"
        );
        rules.setForeground(Color.BLACK);
        add(rules);

        back=new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start=new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
     }

     public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==start){

        } else {
            setVisible(false);
            new Login();
        }
     }
    public static void main(String[] args) {
        new Rules("User");
    }    
}
