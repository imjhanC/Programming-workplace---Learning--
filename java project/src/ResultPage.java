import javax.swing.*;
import java.awt.*;

public class ResultPage{
    JFrame frame = new JFrame("Result");
    JLabel lblprevious1 = new JLabel("Previous Month");
    JLabel lblprevious2 = new JLabel("Previous Electric Used (Kwh)");
    JLabel lblprevious3 = new JLabel("Previous Bill in RM");
    JLabel lblprevious4 = new JLabel("Previous Month Small Room Meter");
    JLabel lblprevious5 = new JLabel("Previous Month Medium Room Meter");
    JLabel lblprevious6 = new JLabel("Previous Month Master Room Meter");

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

    public ResultPage(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        frame.setSize(700,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        new ResultPage();
    }
}