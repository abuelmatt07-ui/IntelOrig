





package TestSwings;

import javax.swing.*;
import java.awt.*;

public class Mark0_Swing{


    static void main(String[] args){

        JFrame main = new JFrame("GoRoom: Check Rooms on the Go!");
        main.setSize(400, 500);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.getContentPane().setBackground(new Color(0x12346));

        main.setLayout(new GridBagLayout());

        Dimension mini = new Dimension(350, 500);

        JPanel Pan1 = new JPanel();
        Pan1.setBackground(new Color(255, 255, 255));
        Pan1.setPreferredSize(new Dimension(mini));
        Pan1.setMinimumSize(mini);
        Pan1.setForeground(new Color(0,0,0));

        JLabel text1 = new JLabel("Text Sample");



        Pan1.add(text1);
        main.add(Pan1);
        main.setVisible(true);

    }


}







