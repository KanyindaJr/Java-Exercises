import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalKeyboard {
    private static boolean shiftPressed = false;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Custom Keyboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4,10));

        String[] keys = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
        };
        for(String key: keys){
            JButton button = new JButton(key);
            button.addActionListener(new KeyClickListener());
            panel.add(button);
        }
        JButton shiftButton = new JButton("Shift");
        shiftButton.addActionListener(e -> toggleShift());
        panel.add(shiftButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(500,200);
        frame.setVisible(true);
    }
    static class KeyClickListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source =(JButton) e.getSource();
            String keyText = source.getText();
            if (shiftPressed) {
                keyText = keyText.toLowerCase();
            }
            System.out.print(keyText);
        }
    }
    private static void toggleShift() {
        shiftPressed = !shiftPressed;
    }
}
