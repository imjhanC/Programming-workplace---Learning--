public class rental {
    // main attributes
    private int current_year;
    private int current_month;
    private int electric_used_kwH;
    private double bil_total_elec;
    private double rate;
    private double common_area_meter;


    // small room
    private double meter_reading_small_room;
    private double electric_used_small_room;
    private double price_to_pay_small_room;

    // medium room
    private double meter_reading_medium_room;
    private double electric_used_medium_room;
    private double price_to_pay_medium_room;

    // master room
    private double meter_reading_master_room;
    private double electric_used_master_room;
    private double price_to_pay_master_room;

    // name of tenants
    private String tenantName;
    
    //water bill
    private double water_bill;

    public rental(int electric_used_kwH, double bil_total_elec){
        this.bil_total_elec = bil_total_elec;
        this.electric_used_kwH = electric_used_kwH;
    }

    public double get_Elec_rate(int electric_used_kwH,double bil_total_electric_used){
        return bil_total_elec/electric_used_kwH;
    }

    public void elec_in(double bil_total_elec){
        this.bil_total_elec = bil_total_elec;
    }

    
}   
