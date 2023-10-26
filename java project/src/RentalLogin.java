import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;

public class RentalLogin{
    JFrame frame = new JFrame("Rental Bill Calculator ");
    
    JLabel previousMonthInstruct = new JLabel("Please enter previous month electric bill information here");   // Instruction for previous month
    JTextField previousElecUsedField = new JTextField();                                                            // Textfield for electric used in previous month
    JTextField previousElecBillField = new JTextField();                                                            // TextField for electric bill in RM in previous month
    JLabel previousElecUsedlbl = new JLabel("Previous Electric Used (kWH)");                                   // Previous month electricity used  label 
    JLabel previousElecBilllbl = new JLabel("Previous Electric Bill in RM");                                   // Previous month elctric bill in RM label
    

    JTextField previousSmallRoomMeterField = new JTextField();                                                      // TextField for small room electricity used in previous month
    JLabel previousSmallRoomMeterlbl = new JLabel("Previous Small Room Meter");                               // Small Room Meter label
    
    JLabel previousMediumRoomMeter = new JLabel();   // Medium Room Meter
    JTextField previousMediumRoomMeterField = new JTextField();
    JLabel previousMediumRoomElectricUsed = new JLabel();
    JLabel previousMediumRoomPriceToPay = new JLabel();
    
    JLabel previousMediumRoomMeterlbl = new JLabel("Previous Medium Room Meter");   // Medium Room Meter label
    JTextField previousMediumRoomMeterFieldlbl = new JTextField();
    JLabel previousMediumRoomElectricUsedlbl = new JLabel();
    JLabel previousMediumRoomPriceToPaylbl = new JLabel();

    JLabel previousMasterRoomMeter = new JLabel();   // Master Room Meter
    JTextField previousMasterRoomMeterField = new JTextField();
    JLabel previousMasterRoomElectricUsed = new JLabel();
    JLabel previousMasterRoomPriceToPay = new JLabel();

    JLabel previousMasterRoomMeterlbl = new JLabel("Previous Master Room Meter");   // Master Room Meter label
    JTextField previousMasterRoomMeterFieldlbl = new JTextField();
    JLabel previousMasterRoomElectricUsedlbl = new JLabel();
    JLabel previousMasterRoomPriceToPaylbl = new JLabel();

    JLabel currentsMonthInstruct = new JLabel("Please enter current month electric bill information here");
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
        previousMonthInstruct.setLocation(20,5);
        previousMonthInstruct.setSize(340, 40);
        previousElecUsedlbl.setLocation(180, 110);
        previousElecUsedlbl.setSize(290, 40);
        previousElecUsedField.setLocation(120,70);
        previousElecUsedField.setSize(290,40);
        previousElecBillField.setLocation();
        previousElecBilllbl.setLocation(460,40);
        previousElecBilllbl.setSize(210,40);
        previousSmallRoomMeterField.setLocation(600,110);
        previousSmallRoomMeterField.setSize(290,40);
        clearAllButton.setLocation(1350,550);
        clearAllButton.setSize(100,40);
        resultButton.setLocation(1500,550);
        resultButton.setSize(100,40);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(previousMonthInstruct);
        panel.add(previousElecUsedlbl);
        panel.add(previousElecBilllbl);
        panel.add(previousElecUsedField);
        panel.add(previousSmallRoomMeterField);
        panel.add(resultButton);
        panel.add(clearAllButton);
        frame.add(panel);
        frame.setSize(1800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new RentalLogin();
    }  
    

}
