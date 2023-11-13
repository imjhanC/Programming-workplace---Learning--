package Converter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Selector implements ActionListener {
   JFrame frame = new JFrame("Selector");
   JLabel label1 = new JLabel("Encrypt ? ");
   JLabel label2 = new JLabel("Decrypt ? ");
   JButton button1 = new JButton("Encrypt");
   JButton button2 = new JButton("Decrypt");

   public Selector() {
      this.label1.setLocation(220, 100);
      this.label2.setLocation(440, 100);
      this.button1.setLocation(170, 200);
      this.button2.setLocation(400, 200);
      this.label1.setSize(150, 100);
      this.label2.setSize(150, 100);
      this.button1.setSize(200, 100);
      this.button2.setSize(200, 100);
      this.label1.setFont(new Font("Verdana", 1, 20));
      this.label2.setFont(new Font("Verdana", 1, 20));
      this.label1.setForeground(Color.GREEN);
      this.label2.setForeground(Color.GREEN);
      this.button1.setFont(new Font("Times New Roman", 1, 20));
      this.button2.setFont(new Font("Times New Roman", 1, 20));
      this.button1.setForeground(Color.RED);
      this.button2.setForeground(Color.RED);
      this.button1.setBackground(Color.DARK_GRAY);
      this.button2.setBackground(Color.DARK_GRAY);
      this.button1.setOpaque(true);
      this.button2.setOpaque(true);
      this.button1.addActionListener(this);
      this.button2.addActionListener(this);
      JPanel panel = new JPanel();
      panel.add(this.label1);
      panel.add(this.label2);
      panel.add(this.button1);
      panel.add(this.button2);
      panel.setLayout((LayoutManager)null);
      panel.setBackground(Color.BLACK);
      this.frame.add(panel);
      this.frame.setSize(800, 500);
      this.frame.setVisible(true);
      this.frame.setLocationRelativeTo((Component)null);
      this.frame.setDefaultCloseOperation(3);
      this.frame.setResizable(false);
   }

   public static void main(String[] args) {
      new Selector();
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == this.button1) {
         Converter.main((String[])null);
         this.frame.dispose();
      }

      if (e.getSource() == this.button2) {
         Decryptor.main((String[])null);
         this.frame.dispose();
      }

   }
}
