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
    private JTextField textField;
    private JTextArea textArea;

    public MyFrame(){
        setTitle("My First GUI Using Java");

        setSize(500,400);

        setLayout(new FlowLayout());

        getContentPane().setBackground(Color.orange);

        // label
        label = new JLabel("Click the button to change the message!");
        label.setFont(new Font("Arial",Font.PLAIN,18));
        label.setForeground(Color.BLACK);
        
        // button
        JButton button = new JButton("Click Me!");
        button.setPreferredSize(new Dimension(150,50));

        // Text Field
        textField = new JTextField(20);
        textField.setFont(new Font("Arial",Font.PLAIN,16));
        textField.setToolTipText("Enter your message here");

        // Text Area
        textArea = new JTextArea(5,30);
        textArea.setFont(new Font("Arial",Font.PLAIN,16));
        textArea.setToolTipText("Your messages will appear here");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        // textArea.setEditable(false);

        // Button Action
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // JOptionPane.showMessageDialog(null, "Button Was Clicked!");
                String inputText = textField.getText();
                if(!inputText.isEmpty()){
                    label.setText("Message: " + inputText);
                    textArea.append("New Message: " + inputText + "\n");
                    textField.setText("");  //clear the text Field
                }else{
                    JOptionPane.showMessageDialog(null, "Please enter a message in the textField");
                }
                // label.setText("Welcome to the Java Swing GUI");
                // label.setBackground(Color.yellow);
                // label.setOpaque(true);
            }
        });
        
        add(label);
        add(button);
        add(textField);
        add(new JScrollPane(textArea)); // Add scroll support for textArea 
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame();
        });
    }
} 

