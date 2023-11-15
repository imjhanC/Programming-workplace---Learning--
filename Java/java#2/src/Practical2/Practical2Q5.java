package Practical2;

public class Practical2Q5 {
    public static void main(String[] args){
        int x = 19;
        binPrint(x);
    }

    public static void binPrint(int x){
        if(x > 0){
            System.out.println(x + " / 2 " + "=" + x/2 +","+ "remainder =" + x%2);
            binPrint(x/2);
        }
    }
}
