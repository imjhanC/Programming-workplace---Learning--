package Practical2;

public class Practical2Q1{
    public static void main(String[] args){
        int n =  5;
        printNum(n);

    }

    public static void printNum(int n){
        if(n == 0){
            System.out.print("0");
        }

        else{
            System.out.println(n);
            printNum(n-1);
        }
    }
}