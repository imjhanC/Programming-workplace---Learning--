package Practical2;

public class Practical2Q4 {
    public static void main(String[] args){
        int x = 5;
        int n = 6;
        int result = calc(x, n);
        System.out.println("result: " + result);
    }

    public static int calc(int x, int n) {
        if(n == 0){
            return 1;
        }

        else if(n > 0){
            return x*calc(x,n-1);
        }

        else{
            return 1/(x*calc(x, n-1));
        }
    }
}
