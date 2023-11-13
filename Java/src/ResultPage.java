import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class ResultPage{
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    JFrame frame = new JFrame("Result");
    JLabel lblprevious1 = new JLabel("Previous Month :");
    JLabel lblprevious2 = new JLabel("Previous Electric Used (Kwh) :");
    JLabel lblprevious3 = new JLabel("Previous Bill in RM :");
    JLabel lblprevious4 = new JLabel("Previous Month Small Room Meter :");
    JLabel lblprevious5 = new JLabel("Previous Month Medium Room Meter :");
    JLabel lblprevious6 = new JLabel("Previous Month Master Room Meter :");

    JLabel lblpreviousElectricUsed = new JLabel();
    JLabel lblpreviousBill = new JLabel();
    JLabel lblpreviousSmallRoomMeter = new JLabel();
    JLabel lblpreviousMediumRoomMeter= new JLabel();
    JLabel lblpreviousMasterRoomMeter = new JLabel();


    JLabel lblcurrent1 = new JLabel("Current Month :");
    JLabel lblcurrent2 = new JLabel("Current Electric Used (Kwh) :");
    JLabel lblcurrent3 = new JLabel("Current Bill in RM :");
    JLabel lblcurrent4 = new JLabel("Current Month Small Room Meter :");
    JLabel lblcurrent5 = new JLabel("Current Month Medium Room Meter :");
    JLabel lblcurrent6 = new JLabel("Current Month Master Room Meter :");
    JLabel person1 = new JLabel("Linus :");
    JLabel person2 = new JLabel("Lucas :");
    JLabel person3 = new JLabel("Ching Hong :");
    JLabel person4 = new JLabel("Jia Han :");
    
    JLabel lblcurrentElectricUsed = new JLabel();
    JLabel lblcurrentBill = new JLabel();
    JLabel lblcurrentSmallRoomMeter = new JLabel();
    JLabel lblcurrentMediumRoomMeter= new JLabel();
    JLabel lblcurrentMasterRoomMeter = new JLabel();

    JLabel person1lbl = new JLabel();
    JLabel person2lbl = new JLabel();
    JLabel person3lbl = new JLabel();
    JLabel person4lbl = new JLabel();

    double person1pay;
    double person2pay;
    double person3pay;
    double person4pay;
    
    public ResultPage(){
        
        lblprevious1.setLocation(270,10);
        lblprevious1.setSize(120,30);
        lblprevious2.setLocation(20,100);
        lblprevious2.setSize(210,30);
        lblprevious3.setLocation(20,200);
        lblprevious3.setSize(210,30);
        lblprevious4.setLocation(20,300);
        lblprevious4.setSize(220,30);
        lblprevious5.setLocation(20,400);
        lblprevious5.setSize(250,30);
        lblprevious6.setLocation(20,500);
        lblprevious6.setSize(250,30);
        lblcurrent1.setLocation(750,10);
        lblcurrent1.setSize(120,30);
        lblcurrent2.setLocation(500,100);
        lblcurrent2.setSize(170,30);
        lblcurrent3.setLocation(500,200);
        lblcurrent3.setSize(120,30);
        lblcurrent4.setLocation(500,300);
        lblcurrent4.setSize(200,30);
        lblcurrent5.setLocation(500,400);
        lblcurrent5.setSize(250,30);
        lblcurrent6.setLocation(500,500);
        lblcurrent6.setSize(250,30);
        person1.setLocation(500,550);
        person1.setSize(210,30);
        person2.setLocation(500,600);
        person2.setSize(210,30);
        person3.setLocation(500,650);
        person3.setSize(210,30);
        person4.setLocation(500,700);
        person4.setSize(210,30);
        person1lbl.setLocation(800,550);
        person1lbl.setSize(210,30);
        person2lbl.setLocation(800,600);
        person2lbl.setSize(210,30);
        person3lbl.setLocation(800,650);
        person3lbl.setSize(210,30);
        person4lbl.setLocation(800,700);
        person4lbl.setSize(210,30);

        lblpreviousElectricUsed.setLocation(300,100);
        lblpreviousElectricUsed.setSize(120,30);
        lblpreviousBill.setLocation(300,200);
        lblpreviousBill.setSize(120,30);
        lblpreviousSmallRoomMeter.setLocation(300,300);
        lblpreviousSmallRoomMeter.setSize(120,30);
        lblpreviousMediumRoomMeter.setLocation(300,400);
        lblpreviousMediumRoomMeter.setSize(120,30);
        lblpreviousMasterRoomMeter.setLocation(300,500);
        lblpreviousMasterRoomMeter.setSize(120,30);

        lblcurrentElectricUsed.setLocation(800,100);
        lblcurrentElectricUsed.setSize(120,30);
        lblcurrentBill.setLocation(800,200);
        lblcurrentBill.setSize(120,30);
        lblcurrentSmallRoomMeter.setLocation(800,300);
        lblcurrentSmallRoomMeter.setSize(120,30);
        lblcurrentMediumRoomMeter.setLocation(800,400);
        lblcurrentMediumRoomMeter.setSize(120,30);
        lblcurrentMasterRoomMeter.setLocation(800,500);
        lblcurrentMasterRoomMeter.setSize(120,30);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(lblprevious1);
        panel.add(lblprevious2);
        panel.add(lblprevious3);
        panel.add(lblprevious4);
        panel.add(lblprevious5);
        panel.add(lblprevious6);
        panel.add(lblpreviousElectricUsed);
        panel.add(lblpreviousBill);
        panel.add(lblpreviousSmallRoomMeter);
        panel.add(lblpreviousMediumRoomMeter);
        panel.add(lblpreviousMasterRoomMeter);
        panel.add(lblcurrent1);
        panel.add(lblcurrent2);
        panel.add(lblcurrent3);
        panel.add(lblcurrent4);
        panel.add(lblcurrent5);
        panel.add(lblcurrent6);
        panel.add(person1);
        panel.add(person2);
        panel.add(person3);
        panel.add(person4);
        panel.add(lblcurrentElectricUsed);
        panel.add(lblcurrentBill);
        panel.add(lblcurrentSmallRoomMeter);
        panel.add(lblcurrentMediumRoomMeter);
        panel.add(lblcurrentMasterRoomMeter);
        panel.add(person1lbl);
        panel.add(person2lbl);
        panel.add(person3lbl);
        panel.add(person4lbl);
        frame.add(panel);
        frame.setSize(1100,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public void setResult(Result rt){
        lblpreviousElectricUsed.setText(String.valueOf(rt.getpreviouselectricUsedKwh()));
        lblpreviousBill.setText(String.valueOf(rt.getpreviousBillTotal()));
        lblpreviousSmallRoomMeter.setText(String.valueOf(rt.getprevioussmallRoomMeterReading()));
        lblpreviousMediumRoomMeter.setText(String.valueOf(rt.getpreviousmediumRoomMeterReading()));
        lblpreviousMasterRoomMeter.setText(String.valueOf(rt.getpreviousmasterRoomMeterReading()));

        lblcurrentElectricUsed.setText(String.valueOf(rt.getcurrentelectricUsedKwh()));
        lblcurrentBill.setText(String.valueOf(rt.getcurrentBillTotal()));
        lblcurrentSmallRoomMeter.setText(String.valueOf(rt.getcurrentsmallRoomMeterReading()));
        lblcurrentMediumRoomMeter.setText(String.valueOf(rt.getcurrentmediumRoomMeterReading()));
        lblcurrentMasterRoomMeter.setText(String.valueOf(rt.getcurrentmasterRoomMeterReading()));
        double currentCommonAreaMeter = rt.getcurrentCommonAreaMeter()*rt.getcurrentElectricRateCal()/4;
        person1pay = (rt.getcurrentpriceToPayMasterRoomUsed()/2) + currentCommonAreaMeter;
        person2pay = (rt.getcurrentpriceToPayMasterRoomUsed()/2) + currentCommonAreaMeter;
        person3pay = rt.getcurrentpriceToPaySmallRoomUsed() +currentCommonAreaMeter;
        person4pay = rt.getcurrentpriceToPayMediumRoomUsed() + currentCommonAreaMeter;

        person1pay = Double.parseDouble(decimalFormat.format(person1pay));
        person2pay = Double.parseDouble(decimalFormat.format(person2pay));
        person3pay = Double.parseDouble(decimalFormat.format(person3pay));
        person4pay = Double.parseDouble(decimalFormat.format(person4pay));
        
        person1lbl.setText(String.valueOf(person1pay));
        person2lbl.setText(String.valueOf(person2pay));
        person3lbl.setText(String.valueOf(person3pay));
        person4lbl.setText(String.valueOf(person4pay));
    }
    public static void main(String[] args) {
        new ResultPage();
    }
}