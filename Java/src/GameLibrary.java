import javax.swing.*;
import java.awt.event.*;

public class GameLibrary {
    JFrame frame = new JFrame("Game Library");
    JButton bttnAdd = new JButton("Add game");

    public GameLibrary(){
        bttnAdd.setLocation(1150,550);
        bttnAdd.setSize(70,40);


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(bttnAdd);
        frame.add(panel);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setSize(1300,700);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args){
        new GameLibrary();
    }
}
