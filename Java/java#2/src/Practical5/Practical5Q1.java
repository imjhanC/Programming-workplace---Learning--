package Practical5;
import java.util.Stack;

public class Practical5Q1 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        int count =0;
        int number =2;

        while(count < 50){
            if(isPrime(number)){
                stack.push(number);
                count++;
            }
            number++;
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        if(num <= 3){
            return true;
        }

        if( num % 2 ==0 || num % 3  == 0){
            return false;
        }


        for( int i =5; i * i<= num ; i+= 6){
            if(num % i ==0 || num % (i +2 ) == 0){
                return false;
            }
        }

        return true;
    }
    
}
