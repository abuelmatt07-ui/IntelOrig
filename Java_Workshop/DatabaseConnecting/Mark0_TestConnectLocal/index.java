package DatabaseConnecting.Mark0_TestConnectLocal; /******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/


import javax.swing.*;
import java.awt.*;



public class index
{
    public static void main(String[] args) {

        Dimension FrameSize = new Dimension(500, 500);

        JFrame win = new JFrame();
        win.setSize(FrameSize);

        JButton MyButton = new JButton("Button");
        MyButton.setMaximumSize(new Dimension(100, 100));

        JPanel MyPanel = new JPanel();



        JLabel MyText = new JLabel("Hello World");



        MyPanel.add(MyText);

        MyPanel.add(MyButton);



        win.add(MyPanel);
        win.setVisible(true);


    }
}