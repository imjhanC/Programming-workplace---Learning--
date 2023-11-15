package Practical2;

public class Practical2Q2 {
    public static void main(String[] args){
        int n =  5;
        printNum(n);

    }

    public static void printNum(int n){
        if(n == 0){
            System.out.println("0");
        }

        else{
            printNum(n-1);
            System.out.println(n);
        }
    }
}
