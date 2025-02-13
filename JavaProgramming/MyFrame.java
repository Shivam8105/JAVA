package JavaProgramming;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JTextArea textArea;

    public MyFrame(){
        setTitle("My First GUI using Java");
        setSize(500,400);
        setLayout(new FlowLayout());

        getContentPane().setBackground(Color.orange);

        //label
        label = new JLabel("click the button to change the message!");
        label.setFont(new Font("Arial",Font.PLAIN,18));
        label.setForeground(Color.black);

        // button
        JButton button = new JButton("click me!");
        button.setPreferredSize(new Dimension(150,50));

        //textField

        textField = new JTextField(20);
        textField.setFont(new Font("Arial",Font.PLAIN,16));
        textField.setToolTipText("Enter your message here:");

        // textArea

        textArea = new JTextArea(5,30);
        textArea.setFont(new Font("Arial",Font.PLAIN,16));
        textArea.setToolTipText("Your messages will appear here.");

        textArea.setWrapStyleWord(true);

        // button action

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Button was clicked");
                String inputText = textField.getText();
                if(!inputText.isEmpty()){
                    label.setText("Message:" + inputText);
                    textArea.append("new message: " + inputText);
                    textField.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Please enter a message in the textField");
                }
            }
        });
        add(label);
        add(button);
        add(textField);
        add(new JScrollPane(textArea));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame();
        });
    }
}
