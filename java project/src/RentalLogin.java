import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;

public class RentalLogin{
    JFrame frame = new JFrame("Login page");
    JLabel lblusername = new JLabel("Username :");
    JLabel lblpassword = new JLabel("Password :");
    JTextField username = new JTextField();

    public RentalLogin(){
        lblusername.setLocation(50,30);
        lblpassword.setLocation(50, 80);
        lblusername.setSize(70, 30);
        lblpassword.setSize(70, 30);
        JPanel panel = new JPanel();
        panel.add(lblusername);
        panel.add(lblpassword);
        panel.setLayout(null);

        frame.add(panel);
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new RentalLogin();
    }  
    
    /*public void actionPerformed(ActionEvent e){
        if(e.getSource()
    }*/




}
