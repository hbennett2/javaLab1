// Creates GUI for money

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class PursePanel extends JPanel
{
    private Purse purse;
    public  JLabel displayResetLabel = new JLabel("");

    public PursePanel()
    {
        this.setPreferredSize(new Dimension(800, 600)); // set size  of panel
        this.purse = new Purse();
    }

    public void setPurse(Purse p) //setter method
    {
        this.purse = p;
    }

    public void setDisplayContents()
    {
        for (Map.Entry<Denominations.MoneyRecord, Integer> cash : purse.cash.entrySet())
        {
            // create money icons to display
            for (int i = 0; i < cash.getValue(); i++)
            {
                ImageIcon icon = new ImageIcon(cash.getKey().image());
                Image img = icon.getImage();
                Image scaledImg = img.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImg);

                JLabel label = new JLabel(scaledIcon); // set icon to label
                this.add(label); // add label to panel
            }
        }
        this.add(displayResetLabel);
        repaint();
    }

    // not implemented
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
}