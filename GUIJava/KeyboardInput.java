import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Keyboard Example");
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                System.out.print(c);
            }
            @Override
            public void keyPressed(KeyEvent e){

            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
                
            });

            frame.getContentPane().add(textField);
            frame.setSize(300,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            }
}
