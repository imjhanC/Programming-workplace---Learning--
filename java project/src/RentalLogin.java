import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;

public class RentalLogin{
    JFrame frame = new JFrame("Rental Bill Calculator ");

    JLabel previousElecUsed = new JLabel();          // Previous month electric bill
    JTextField previousElecUsedField = new JTextField();
    JLabel previousElecBill = new JLabel();
    JTextField previousElecBillField = new JTextField();
    JLabel previousElecRate = new JLabel();
    JLabel previousCommonAreameter = new JLabel();   //Common Area Meter

    JLabel previousSmallRoomMeter = new JLabel();    // Small Room Meter
    JTextField previousSmallRoomMeterField = new JTextField();
    JLabel previousSmallRoomElectricUsed = new JLabel();
    JLabel previousSmallRoomPriceToPay = new JLabel();

    JLabel previousMediumRoomMeter = new JLabel();   // Medium Room Meter
    JTextField previousMediumRoomMeterField = new JTextField();
    JLabel previousMediumRoomElectricUsed = new JLabel();
    JLabel previousMediumRoomPriceToPay = new JLabel();
    
    JLabel previousMasterRoomMeter = new JLabel();   // Master Room Meter
    JTextField previousMasterRoomMeterField = new JTextField();
    JLabel previousMasterRoomElectricUsed = new JLabel();
    JLabel previousMasterRoomPriceToPay = new JLabel();


    JLabel currentElecUsed = new JLabel();          // Current month electric bill
    JTextField currentElecUsedField = new JTextField();
    JLabel currentElecBill = new JLabel();
    JLabel currentElecRate = new JLabel();
    JLabel currentCommonAreameter = new JLabel();   //Common Area Meter

    JLabel currentSmallRoomMeter = new JLabel();    // Small Room Meter
    JTextField currentSmallRoomMeterField = new JTextField();
    JLabel currentSmallRoomElectricUsed = new JLabel();
    JLabel currentSmallRoomPriceToPay = new JLabel();

    JLabel currentMediumRoomMeter = new JLabel();   // Medium Room Meter
    JTextField currentMediumRoomMeterField = new JTextField();
    JLabel currentMediumRoomElectricUsed = new JLabel();
    JLabel currentMediumRoomPriceToPay = new JLabel();
    
    JLabel currentMasterRoomMeter = new JLabel();   // Master Room Meter
    JTextField currentMasterRoomMeterField = new JTextField();
    JLabel currentMasterRoomElectricUsed = new JLabel();
    JLabel currentMasterRoomPriceToPay = new JLabel();

    JButton clearAllButton = new JButton("Clear All");  //Clear Button
    JButton resultButton = new JButton("Result");       //Result Button

    public RentalLogin(){
        
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new RentalLogin();
    }  
    

}
