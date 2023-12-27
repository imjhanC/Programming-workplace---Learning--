package Practical4;
import java.util.LinkedList;

public class Practical4Q3 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i = 0 ; i <500000; i++){
            list.add(i);
        }

        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        for(int i  =0; i < list.size(); i++){
            list.get(i);
        }

        System.out.print("Traverse time using index is :" + (endTime -startTime));


        int x;
        startTime = System.currentTimeMillis();
        for(int i: list){
            x =i;
        }

        endTime = System.currentTimeMillis();
        System.out.print("Traverse time using iterator is : " + (endTime - startTime));

        
    }
}
