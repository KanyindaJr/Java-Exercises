import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwingApp{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Clicked");
            }
        });
        JPanel panel = new JPanel();
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}