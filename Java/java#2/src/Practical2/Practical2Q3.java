package Practical2;

public class Practical2Q3 {
    public static void main(String[] args){
        int n  =5;
        int result = power(n);
        System.out.println("result: " + result);
    }

    public static int power(int n) {
        if(n > 0){
            return n*n + power(n-1);
        }
        else{
            return 0;
        }
    }
}
