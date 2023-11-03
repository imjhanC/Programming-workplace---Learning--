import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RentalLogin{
    JFrame frame = new JFrame("Rental Bill Calculator ");
    
    JLabel previousMonthInstruct = new JLabel("Please enter previous month electric bill information here");   // Instruction for previous month
    JTextField previousElecUsedField = new JTextField();                                                            // Textfield for electric used in previous month
    JTextField previousElecBillField = new JTextField();                                                            // TextField for electric bill in RM in previous month
    JLabel previousElecUsedlbl = new JLabel("Previous Electric Used (kWH)");                                   // Previous month electricity used  label 
    JLabel previousElecBilllbl = new JLabel("Previous Electric Bill in RM");                                   // Previous month elctric bill in RM label
    

    JTextField previousSmallRoomMeterField = new JTextField();                                                      // TextField for small room electricity used in previous month
    JLabel previousSmallRoomMeterlbl = new JLabel("Previous Small Room Meter");                                // Small Room Meter label
    
    JLabel previousMediumRoomMeterlbl = new JLabel("Previous Medium Room Meter");                              // Medium Room Meter
    JTextField previousMediumRoomMeterField = new JTextField();                                                     // TextField for medium room electricity used in previous month
    
    JLabel previousMasterRoomMeterlbl = new JLabel("Previous Master Room Meter");                              // Master Room Meter
    JTextField previousMasterRoomMeterField = new JTextField();                                                     // TextField for master room electricity used in previous month
    //current month
    JLabel currentsMonthInstruct = new JLabel("Please enter current month electric bill information here");
    JTextField currentElecUsedField = new JTextField();                                                             // Textfield for electric used in current month
    JTextField currentElecBillField = new JTextField();                                                             // TextField for electric bill in RM in current month
    JLabel currentElecUsedlbl = new JLabel("Current Electric Used (kWH)");                                     // current month electricity used  label 
    JLabel currentElecBilllbl = new JLabel("Current Electric Bill in RM");                                     // current month elctric bill in RM label
    

    JTextField currentSmallRoomMeterField = new JTextField();                                                       // TextField for small room electricity used in current month
    JLabel currentSmallRoomMeterlbl = new JLabel("Current Small Room Meter");                                  // Small Room Meter label
    
    JLabel currentMediumRoomMeterlbl = new JLabel("Current Medium Room Meter");                                // Medium Room Meter
    JTextField currentMediumRoomMeterField = new JTextField();                                                      // TextField for medium room electricity used in current month
    
    JLabel currentMasterRoomMeterlbl = new JLabel("Current Master Room Meter");                                // Master Room Meter
    JTextField currentMasterRoomMeterField = new JTextField();                                                      // TextField for master room electricity used in current month
    

    JButton clearAllButton = new JButton("Clear All");                                                         // Clear Button
    JButton resultButton = new JButton("Result");                                                              // Result Button

    double currentelectricUsedKwh;      // current month electric kwh used
    double previouselectricUsedKwh;     // previous month electric kwh used
    double currentBillTotal;            // current total bill
    double previousBillTotal;           // previous total bill
    double currentElectricRateCal;      // rate
    double commonAreaMeter;             // common area meter
    double smallRoomMeterReading;
    double smallRoomElectricUsed;
    double priceToPaySmallRoomUsed;
    double mediumRoomMeterReading;
    double mediumRoomElectricUsed;
    double priceToPayMediumRoomUsed;
    double masterRoomMeterReading;
    double masterRoomElectricUsed;
    double masterToPayMediumRoomUsed;



    public RentalLogin(){
        previousMonthInstruct.setLocation(20,5);
        previousMonthInstruct.setSize(340, 40);
        previousElecUsedlbl.setLocation(130, 110);
        previousElecUsedlbl.setSize(290, 40);
        previousElecUsedField.setLocation(80,70);
        previousElecUsedField.setSize(290,40);
        previousElecBillField.setLocation(400,70);
        previousElecBillField.setSize(290,40);
        previousElecBilllbl.setLocation(460,110);
        previousElecBilllbl.setSize(210,40);
        previousSmallRoomMeterField.setLocation(820,70);
        previousSmallRoomMeterField.setSize(290,40);
        previousSmallRoomMeterlbl.setLocation(900,110);
        previousSmallRoomMeterlbl.setSize(200,40);
        previousMediumRoomMeterField.setLocation(1150,70);
        previousMediumRoomMeterField.setSize(290,40);
        previousMediumRoomMeterlbl.setLocation(1200,110);
        previousMediumRoomMeterlbl.setSize(200,40);
        previousMasterRoomMeterlbl.setLocation(1530,110);
        previousMasterRoomMeterlbl.setSize(200,40);
        previousMasterRoomMeterField.setLocation(1470,70); 
        previousMasterRoomMeterField.setSize(290,40);
        currentsMonthInstruct.setLocation(20,250);
        currentsMonthInstruct.setSize(340,40);
        currentElecUsedField.setLocation(80,310);
        currentElecUsedField.setSize(290,40);
        currentElecUsedlbl.setLocation(130,350);
        currentElecUsedlbl.setSize(290,40);
        currentElecBillField.setLocation(400,310);
        currentElecBillField.setSize(290,40);
        currentElecBilllbl.setLocation(460,350);
        currentElecBilllbl.setSize(290,40);
        currentSmallRoomMeterField.setLocation(820,310);
        currentSmallRoomMeterField.setSize(290,40);
        currentSmallRoomMeterlbl.setLocation(900,350);
        currentSmallRoomMeterlbl.setSize(200,40);
        currentMediumRoomMeterField.setLocation(1150,310);
        currentMediumRoomMeterField.setSize(290,40);
        currentMediumRoomMeterlbl.setLocation(1200,350);
        currentMediumRoomMeterlbl.setSize(200,40);
        currentMasterRoomMeterField.setLocation(1470,310);
        currentMasterRoomMeterField.setSize(290,40);
        currentMasterRoomMeterlbl.setLocation(1530,350);
        currentMasterRoomMeterlbl.setSize(200,40);
        

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
        panel.add(previousElecBillField);
        panel.add(previousSmallRoomMeterlbl);
        panel.add(previousSmallRoomMeterField); 
        panel.add(previousMediumRoomMeterField);
        panel.add(previousMediumRoomMeterlbl);
        panel.add(previousMasterRoomMeterlbl);
        panel.add(previousMasterRoomMeterField);
        panel.add(currentsMonthInstruct);
        panel.add(currentElecUsedField);
        panel.add(currentElecUsedlbl);
        panel.add(currentElecBillField);
        panel.add(currentElecBilllbl);
        panel.add(currentSmallRoomMeterlbl);
        panel.add(currentSmallRoomMeterField); 
        panel.add(currentMediumRoomMeterField);
        panel.add(currentMediumRoomMeterlbl);
        panel.add(currentMasterRoomMeterlbl);
        panel.add(currentMasterRoomMeterField);
        panel.add(resultButton);
        panel.add(clearAllButton);
        frame.add(panel);
        frame.setSize(1800,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (areAllFieldsFilled()) {
                    previouselectricUsedKwh = Double.parseDouble(previousElecUsedField.getText());
                    currentelectricUsedKwh = Double.parseDouble(currentElecUsedField.getText());
                    currentBillTotal = Double.parseDouble(currentElecBillField.getText());
                    previousBillTotal = Double.parseDouble(previousElecBillField.getText());
                    smallRoomMeterReading =Double.parseDouble(currentSmallRoomMeterField.getText());
                    mediumRoomMeterReading=Double.parseDouble(currentMediumRoomMeterField.getText());
                    masterRoomMeterReading=Double.parseDouble(currentMasterRoomMeterField.getText());
                } else {
                    // Display an error message if one of the field is not filled or all fields are not filled
                    JOptionPane.showMessageDialog(frame, "Please make sure that all fields are filled.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the text in all text fields
                previousElecUsedField.setText("");
                previousElecBillField.setText("");
                previousSmallRoomMeterField.setText("");
                previousMediumRoomMeterField.setText("");
                previousMasterRoomMeterField.setText("");
                currentElecUsedField.setText("");
                currentElecBillField.setText("");
                currentSmallRoomMeterField.setText("");
                currentMediumRoomMeterField.setText("");
                currentMasterRoomMeterField.setText("");
            }
        });
    }

    private boolean areAllFieldsFilled() {
        // Check all the text fields for empty values
        return !previousElecUsedField.getText().isEmpty() &&
               !previousElecBillField.getText().isEmpty() &&
               !previousSmallRoomMeterField.getText().isEmpty() &&
               !previousMediumRoomMeterField.getText().isEmpty() &&
               !previousMasterRoomMeterField.getText().isEmpty() &&
               !currentElecUsedField.getText().isEmpty() &&
               !currentElecBillField.getText().isEmpty() &&
               !currentSmallRoomMeterField.getText().isEmpty() &&
               !currentMediumRoomMeterField.getText().isEmpty() &&
               !currentMasterRoomMeterField.getText().isEmpty();
    }

    public static void main(String[] args){
        new RentalLogin();
    }  
    
    public class resultWindow{

    }
}
