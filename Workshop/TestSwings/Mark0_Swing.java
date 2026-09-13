





package TestSwings;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class Mark0_Swing{


    static void main(String[] args){

        JFrame main = new JFrame("GoRoom: Check Rooms on the Go!");
        main.setSize(800, 1000);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.getContentPane().setBackground(new Color(0x12346));
        main.setLayout(new GridBagLayout());


        ImageIcon Logo = new ImageIcon("room.png");
        main.setIconImage(Logo.getImage());




        Dimension mini = new Dimension(350, 550);
        Color blue = new Color(0x123456);
        Color yellow = new Color(252, 186, 3);



        JPanel Pan1 = new JPanel();
        Pan1.setLayout(new BoxLayout(Pan1, BoxLayout.Y_AXIS));
        Pan1.setBackground(new Color(255, 255, 255));
        Pan1.setPreferredSize(new Dimension(mini));
        Pan1.setMinimumSize(mini);
        Pan1.setForeground(new Color(0,0,0));



        Font Titles = new Font("Times New Roman", Font.BOLD, 45);
        Font SubTitles = new Font("Times New Roman", Font.ITALIC, 25);
        Font InText = new Font("Arial", Font.PLAIN, 20);



        JLabel text1 = new JLabel("GoRoom");
        text1.setFont(Titles);
        text1.setForeground(blue);
        text1.setAlignmentX(Component.CENTER_ALIGNMENT);




        JLabel text2 = new JLabel("Sign In");
        text2.setForeground(Color.black);
        text2.setFont(SubTitles);
        text2.setAlignmentX(Component.CENTER_ALIGNMENT);


        Dimension inputFieldsCon = new Dimension(200, 30);
        Dimension inputField = new Dimension(200, 25);


        JTextField InName = new JTextField();
        InName.setMaximumSize(inputField);


        JPasswordField InPass = new JPasswordField();
        InPass.setMaximumSize(inputField);

        JButton Log = new JButton("Log In");
        Log.setMinimumSize(inputField);
        Log.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Field Labels

        JLabel LaName = new JLabel("Email");
        LaName.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel LaPass = new JLabel("Password");
        LaPass.setAlignmentX(Component.CENTER_ALIGNMENT);




        main.add(Pan1);

        Pan1.add(Box.createVerticalStrut(15));//Padding (Manual as Shit)


        Pan1.add(text1);//Titles
        Pan1.add(text2);

        Pan1.add(Box.createVerticalStrut(10));

        Pan1.add(LaName);
        Pan1.add(InName);

        Pan1.add(LaPass);
        Pan1.add(InPass);

        Pan1.add(Log);// Button Log

        main.setVisible(true);

    }


}







