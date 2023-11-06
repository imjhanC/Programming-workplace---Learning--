public class Result {
    private double currentelectricUsedKwh;          // current month electric kwh used  /
    private double previouselectricUsedKwh;         // previous month electric kwh used /
    private double currentBillTotal;                // current total bill /
    private double previousBillTotal;               // previous total bill
    private double currentElectricRateCal;          // rate
    private double currentCommonAreaMeter;          // common area meter

    private double previoussmallRoomMeterReading;   // previous small room meter reading
    private double currentsmallRoomMeterReading;    // current small room meter reading
    private double previoussmallRoomElectricUsed;   // previous small room electric used
    private double currentsmallRoomElectricUsed;    // current small room electric used
    private double currentpriceToPaySmallRoomUsed;  // current small room amount to pay

    private double previousmediumRoomMeterReading;   // previous medium room meter reading
    private double currentmediumRoomMeterReading;    // current medium room meter reading
    private double previousmediumRoomElectricUsed;   // previous medium room electric used
    private double currentmediumRoomElectricUsed;    // current medium room electric used
    private double currentpriceToPayMediumRoomUsed;  // current medium room amount to pay

    private double previousmasterRoomMeterReading;   // previous master room meter reading
    private double currentmasterRoomMeterReading;    // current master room meter reading
    private double previousmasterRoomElectricUsed;   // previous master room electric used
    private double currentmasterRoomElectricUsed;    // current master room electric used
    private double currentpriceToPayMasterRoomUsed;  // current master room amount to pay

    public Result(){

    }

    public double getcurrentelectricUsedKwh(){
        return currentelectricUsedKwh;
    }

    public void setcurrentelectricUsedKwh(double currentelectricUsedKwh){
        this.currentelectricUsedKwh = currentelectricUsedKwh;
    }

    public double getpreviouselectricUsedKwh(){
        return previouselectricUsedKwh;
    }

    public void setpreviouselectricUsedKwh(double previouselectricUsedKwh){
        this.previouselectricUsedKwh = previouselectricUsedKwh;
    }

    public double getcurrentBillTotal(){
        return currentBillTotal;
    }

    public void setcurrentBillTotal(double currentBillTotal){
        this.currentBillTotal = currentBillTotal;
    }

    public double getpreviousBillTotal(){
        return previousBillTotal;
    }

    public void setpreviousBillTotal(double previousBillTotal){
        this.previousBillTotal = previousBillTotal;
    }

    public double getcurrentElectricRateCal(){
        return currentElectricRateCal;
    }

    public void setcurrentElectricRateCal(double currentElectricRateCal){
        this.currentElectricRateCal = currentElectricRateCal;
    }



}
