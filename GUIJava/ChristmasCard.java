import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChristmasCard {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
            JFrame frame = new JFrame("Christmas Button");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());
            JButton christmasButton = new JButton("Merry Christmas");
            christmasButton.addActionListener (new ActionListener()){
                @Override
                public void actionPerformed(ActionEvent e) {
                    christmasButton.setText("TO YOU");
                }
            });
            frame.add(christmasButton);
            frame.selectSize(200,100);
            frame.setLocationRealtiveTo(null);
            frame.setVisible(true);
        });
    }
}
