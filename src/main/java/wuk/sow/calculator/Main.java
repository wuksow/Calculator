package wuk.sow.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {


    public static void main(String[] args) {
        sendStartoweGUI();
    }





    ////










    private static void sendStartoweGUI() {
        String name = "Potwierdzenie!";
        JFrame frame = new JFrame(name);
        Image imageIcon = Toolkit.getDefaultToolkit().getImage("tak.png");
        frame.setIconImage(imageIcon);
        //guzik
        JButton button1 = new JButton("Kliknij aby kontynuować");
        button1.setBounds(80, 150, 200, 50);
        button1.setForeground(Color.red);
        button1.setBackground(Color.lightGray);
        button1.setFocusPainted(false);
        button1.setFont(new Font("Serif", Font.BOLD, 14));
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setVerticalTextPosition(SwingConstants.BOTTOM);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
               GuiKalkulator();
            }
        });

        frame.add(button1, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(3);
        frame.setLocation(150, 150);
        frame.setSize(400 , 400);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    private static void GuiKalkulator() {
        System.out.println("test");
        JFrame frame = new JFrame("Kalkulator V1");
        Image imageIcon = Toolkit.getDefaultToolkit().getImage("tak.png");
        frame.setIconImage(imageIcon);


        JButton button = new JButton("1");
        JButton button1 = new JButton("2");


        frame.add(button1);
        frame.setDefaultCloseOperation(3);
        frame.setLocation(200, 200);
        frame.setSize(400 , 400);
        frame.setVisible(true);
    }

}
