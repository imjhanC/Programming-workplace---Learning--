public class test_rental {
    public static void main(String[] args){
        rental rt = new rental(735,208.96);

        double result = rt.get_Elec_rate(735, 208.96);
        System.out.println(result);
    }
}
