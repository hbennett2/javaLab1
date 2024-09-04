// Run on this class
// Sets register frame

import java.awt.*;
import javax.swing.*;

public class MakingChange
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(800,400)); // set frame size
        RegisterPanel registerPanel = new RegisterPanel(frame);
        frame.add(registerPanel); // adds panel to frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit

        frame.pack(); //resizes frame to look nice!
        frame.setVisible(true);
    }
}