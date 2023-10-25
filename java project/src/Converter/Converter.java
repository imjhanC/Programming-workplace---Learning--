package Converter;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Converter implements ActionListener {
   JFrame frame = new JFrame("Converter");
   JLabel label1 = new JLabel("Insert your password here");
   JLabel label2 = new JLabel("Encrypted password");
   JLabel labelresult = new JLabel();
   JTextField txt1 = new JTextField("Input password here...");
   JButton bttnConvert = new JButton("Convert");
   JButton bttnreset = new JButton("Clear");
   JButton bttnCopy = new JButton("Copy");
   JButton bttnmain = new JButton("Main Menu");

   public Converter() {
      this.label1.setLocation(170, 100);
      this.label2.setLocation(170, 200);
      this.txt1.setLocation(450, 120);
      this.bttnConvert.setLocation(660, 100);
      this.bttnreset.setLocation(660, 150);
      this.bttnCopy.setLocation(660, 230);
      this.bttnmain.setLocation(300, 350);
      this.labelresult.setLocation(450, 200);
      this.label1.setSize(300, 100);
      this.label2.setSize(300, 100);
      this.labelresult.setSize(300, 100);
      this.txt1.setSize(200, 50);
      this.bttnConvert.setSize(100, 40);
      this.bttnreset.setSize(100, 40);
      this.bttnCopy.setSize(100, 40);
      this.bttnmain.setSize(200, 100);
      this.label1.setFont(new Font("Verdana", 1, 15));
      this.label2.setFont(new Font("Verdana", 1, 15));
      this.labelresult.setFont(new Font("Verdana", 1, 15));
      this.txt1.setFont(new Font("Times New Roman", 1, 17));
      this.bttnmain.setFont(new Font("Verdana", 2, 20));
      this.txt1.setForeground(Color.GRAY);
      this.label1.setForeground(Color.GREEN);
      this.label2.setForeground(Color.GREEN);
      this.labelresult.setForeground(Color.WHITE);
      this.bttnConvert.addActionListener(this);
      this.bttnreset.addActionListener(this);
      this.bttnCopy.addActionListener(this);
      this.bttnmain.addActionListener(this);
      this.txt1.addFocusListener(new FocusListener() {
         public void focusGained(FocusEvent e) {
            if (Converter.this.txt1.getText().equals("Input password here...")) {
               Converter.this.txt1.setText("");
            }

         }

         public void focusLost(FocusEvent e) {
            if (Converter.this.txt1.getText().isEmpty()) {
               Converter.this.txt1.setText("Input password here...");
            }

         }
      });
      JPanel panel = new JPanel();
      panel.setLayout((LayoutManager)null);
      panel.add(this.label1);
      panel.add(this.label2);
      panel.add(this.txt1);
      panel.add(this.labelresult);
      panel.add(this.bttnConvert);
      panel.add(this.bttnreset);
      panel.add(this.bttnCopy);
      panel.add(this.bttnmain);
      panel.setBackground(Color.BLACK);
      this.frame.add(panel);
      this.frame.setSize(800, 500);
      this.frame.setVisible(true);
      this.frame.setLocationRelativeTo((Component)null);
      this.frame.setDefaultCloseOperation(3);
      this.frame.setResizable(false);
   }

   public static void main(String[] args) {
      new Converter();
   }

   public void actionPerformed(ActionEvent e) {
      String encryptedPassword;
      if (e.getSource() == this.bttnConvert) {
         encryptedPassword = this.txt1.getText();
         if (encryptedPassword.equals("Input password here...")) {
            this.labelresult.setText("Please enter a password!");
         } else {
            String encryptedpassword = encrypt(encryptedPassword);
            this.labelresult.setText(encryptedpassword);
         }
      }

      if (e.getSource() == this.bttnreset) {
         this.txt1.setText("");
      }

      if (e.getSource() == this.bttnCopy) {
         encryptedPassword = this.labelresult.getText();
         this.copyToClipboard(encryptedPassword);
      }

      if (e.getSource() == this.bttnmain) {
         Selector.main((String[])null);
         this.frame.dispose();
      }

   }

   public static String encrypt(String str) {
      String substitutions = "abcdefghijklmnopqrstuvwxyz0123456789@._ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String replacement = "z10hxspbwkmuvrd2jy6on3cq5t4a7iegl@f_9-8GLWURYHVOXZKMCNPEADSIBJFTQ";
      StringBuilder encryptedStr = new StringBuilder();
      char[] var7;
      int var6 = (var7 = str.toCharArray()).length;

      for(int var5 = 0; var5 < var6; ++var5) {
         char ch = var7[var5];
         int index = substitutions.indexOf(ch);
         if (index != -1) {
            encryptedStr.append(replacement.charAt(index));
         } else {
            encryptedStr.append(ch);
         }
      }

      return encryptedStr.toString();
   }

   private void copyToClipboard(String text) {
      StringSelection selection = new StringSelection(text);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(selection, (ClipboardOwner)null);
   }
}
