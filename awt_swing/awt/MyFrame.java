package awt_swing.awt;

// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame{
    private JLabel label;
    public MyFrame(){
        setTitle("My First GUI Using Java");

        setSize(500,400);

        setLayout(new FlowLayout());

        getContentPane().setBackground(Color.orange);

        label = new JLabel("Click the button to change the message!");

        label.setFont(new Font("Arial",Font.PLAIN,18));
        label.setForeground(Color.BLACK);



        
        JButton button = new JButton("Click Me!");
        button.setPreferredSize(new Dimension(150,50));

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // JOptionPane.showMessageDialog(null, "Button Was Clicked!");
                label.setText("Welcome to the Java Swing GUI");
                label.setBackground(Color.yellow);
                label.setOpaque(true);
            }
        });
        
        add(label);
        add(button);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame();
        });
    }
} 

