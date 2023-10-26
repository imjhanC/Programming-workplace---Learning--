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

    JLabel previousElecUsedlbl = new JLabel();          // Previous month electric bill label 
    JTextField previousElecUsedFieldlbl = new JTextField();  //label
    JLabel previousElecBilllbl = new JLabel();               //label
    JTextField previousElecBillFieldlbl = new JTextField();  //label
    JLabel previousElecRatelbl = new JLabel();               //label
    JLabel previousCommonAreameterlbl = new JLabel();   //Common Area Meter label
    


    JLabel previousSmallRoomMeter = new JLabel();    // Small Room Meter
    JTextField previousSmallRoomMeterField = new JTextField();
    JLabel previousSmallRoomElectricUsed = new JLabel();
    JLabel previousSmallRoomPriceToPay = new JLabel();

    JLabel previousSmallRoomMeterlbl = new JLabel();    // Small Room Meter label
    JTextField previousSmallRoomMeterFieldlbl = new JTextField();
    JLabel previousSmallRoomElectricUsedlbl = new JLabel();
    JLabel previousSmallRoomPriceToPaylbl = new JLabel();

    JLabel previousMediumRoomMeter = new JLabel();   // Medium Room Meter
    JTextField previousMediumRoomMeterField = new JTextField();
    JLabel previousMediumRoomElectricUsed = new JLabel();
    JLabel previousMediumRoomPriceToPay = new JLabel();
    
    JLabel previousMediumRoomMeterlbl = new JLabel();   // Medium Room Meter label
    JTextField previousMediumRoomMeterFieldlbl = new JTextField();
    JLabel previousMediumRoomElectricUsedlbl = new JLabel();
    JLabel previousMediumRoomPriceToPaylbl = new JLabel();

    JLabel previousMasterRoomMeter = new JLabel();   // Master Room Meter
    JTextField previousMasterRoomMeterField = new JTextField();
    JLabel previousMasterRoomElectricUsed = new JLabel();
    JLabel previousMasterRoomPriceToPay = new JLabel();

    JLabel previousMasterRoomMeterlbl = new JLabel();   // Master Room Meter label
    JTextField previousMasterRoomMeterFieldlbl = new JTextField();
    JLabel previousMasterRoomElectricUsedlbl = new JLabel();
    JLabel previousMasterRoomPriceToPaylbl = new JLabel();


    JLabel currentElecUsed = new JLabel();          // Current month electric bill
    JTextField currentElecUsedField = new JTextField();
    JLabel currentElecBill = new JLabel();
    JLabel currentElecRate = new JLabel();
    JLabel currentCommonAreameter = new JLabel();   //Common Area Meter

    JLabel currentElecUsedlabel = new JLabel();          // Current month electric bill label
    JTextField currentElecUsedFieldlabel = new JTextField();
    JLabel currentElecBilllabel = new JLabel();
    JLabel currentElecRatelabel = new JLabel();
    JLabel currentCommonAreameterlabel = new JLabel();   //Common Area Meter

    JLabel currentSmallRoomMeter = new JLabel();    // Small Room Meter
    JTextField currentSmallRoomMeterField = new JTextField();
    JLabel currentSmallRoomElectricUsed = new JLabel();
    JLabel currentSmallRoomPriceToPay = new JLabel();

    JLabel currentSmallRoomMeterlbl = new JLabel();    // Small Room Meter label
    JTextField currentSmallRoomMeterFieldlbl = new JTextField();
    JLabel currentSmallRoomElectricUsedlbl = new JLabel();
    JLabel currentSmallRoomPriceToPaylbl = new JLabel();

    JLabel currentMediumRoomMeter = new JLabel();   // Medium Room Meter
    JTextField currentMediumRoomMeterField = new JTextField();
    JLabel currentMediumRoomElectricUsed = new JLabel();
    JLabel currentMediumRoomPriceToPay = new JLabel();

    JLabel currentMediumRoomMeterlbl = new JLabel();   // Medium Room Meter label
    JTextField currentMediumRoomMeterFieldlbl = new JTextField();
    JLabel currentMediumRoomElectricUsedlbl = new JLabel();
    JLabel currentMediumRoomPriceToPaylbl = new JLabel();
    
    JLabel currentMasterRoomMeter = new JLabel();   // Master Room Meter
    JTextField currentMasterRoomMeterField = new JTextField();
    JLabel currentMasterRoomElectricUsed = new JLabel();
    JLabel currentMasterRoomPriceToPay = new JLabel();
    
    JLabel currentMasterRoomMeterlbl = new JLabel();   // Master Room Meter label
    JTextField currentMasterRoomMeterFieldlbl = new JTextField();
    JLabel currentMasterRoomElectricUsedlbl = new JLabel();
    JLabel currentMasterRoomPriceToPaylbl = new JLabel();

    JButton clearAllButton = new JButton("Clear All");  //Clear Button
    JButton resultButton = new JButton("Result");       //Result Button

    public RentalLogin(){
        
        frame.setSize(1000,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new RentalLogin();
    }  
    

}
