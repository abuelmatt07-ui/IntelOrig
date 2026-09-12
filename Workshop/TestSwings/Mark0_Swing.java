





package TestSwings;

import javax.swing.*;
import javax.swing.border.Border;
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

        Pan1.setAlignmentX(Component.CENTER_ALIGNMENT);



        JLabel text1 = new JLabel("GoRoom");
        text1.setFont(new Font("Times New Roman", Font.BOLD, 45));
        text1.setForeground(blue);
        text1.setAlignmentX(Component.CENTER_ALIGNMENT);




        JLabel text2 = new JLabel("Log In");
        text2.setForeground(Color.black);
        text2.setAlignmentX(Component.CENTER_ALIGNMENT);





        main.add(Pan1);

        Pan1.add(Box.createVerticalStrut(15));
        Pan1.add(text1);
        Pan1.add(text2);

        main.setVisible(true);

    }


}







