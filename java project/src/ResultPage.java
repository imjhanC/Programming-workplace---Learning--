import javax.swing.*;
import java.awt.*;

public class ResultPage{
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


    JLabel lblcurrent1 = new JLabel("Current Month");
    JLabel lblcurrent2 = new JLabel("Current Electric Used");
    JLabel lblcurrent3 = new JLabel("Current Bill in RM");
    JLabel lblcurrent4 = new JLabel("Current Month Small Room Meter");
    JLabel lblcurrent5 = new JLabel("Current Month Medium Room Meter");
    JLabel lblcurrent6 = new JLabel("Current Month Master Room Meter");
    JLabel person1 = new JLabel("Linus");
    JLabel person2 = new JLabel("Lucas");
    JLabel person3 = new JLabel("Ching Hong");
    JLabel person4 = new JLabel("Jia Han");
    double commonareameter;
    double rate;
    double smallroompricetoPay;
    double mediumroompricetoPay;
    double masterroompricetoPay;

    public ResultPage(){
        Result rt = new Result();
        lblpreviousElectricUsed.setText(String.valueOf(rt.getpreviouselectricUsedKwh()));
        lblpreviousBill.setText(String.valueOf(rt.getpreviousBillTotal()));
        lblpreviousSmallRoomMeter.setText(String.valueOf(rt.getprevioussmallRoomMeterReading()));
        lblpreviousMediumRoomMeter.setText(String.valueOf(rt.getpreviousmediumRoomMeterReading()));
        lblpreviousMasterRoomMeter.setText(String.valueOf(rt.getpreviousmasterRoomMeterReading()));
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
        frame.add(panel);
        frame.setSize(1100,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new ResultPage();
    }
}