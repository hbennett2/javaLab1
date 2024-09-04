// Creates GUI for input

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Panel that will hold componets
public final class RegisterPanel extends JPanel
{
    private JTextField inputBox;
    private Register register;
    private PursePanel iconPanel;
    private JFrame frame;

    public RegisterPanel(JFrame frame)
    {
        this.setPreferredSize(new Dimension(800, 700));
        this.frame = frame;
        register = new Register();

        JPanel inputPanel = new JPanel(); //create panel
        inputBox = new JTextField(); //create textbox
        inputBox.setPreferredSize(new Dimension(100, 25)); //set size
        inputBox.addActionListener(new InputListener() {});
        inputPanel.add(new JLabel("Enter Amount:")); // prompt label
        inputPanel.add(inputBox); // add textbox to panel

        iconPanel = new PursePanel();

        this.add(inputPanel); // adds to register panel (input)
        this.add(iconPanel); // adds to register panel (money display)
    }

    // Gets text --> listens to "enter" -> converts to double --> displays images
    private class InputListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String text = inputBox.getText();// gets text input
            double amount = Double.parseDouble(text); // string to double
            Purse purse = Register.makeChange(amount); // method call
            System.out.println(purse); // cmdline print
            iconPanel.setPurse(purse);
            iconPanel.setDisplayContents();
            frame.setVisible(true);
        }
    }
}