package Practical6;


import java.util.*;
public class Practical6Q2 {
    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        Random rand = new Random();

        for(int i=0 ; i < 20 ; i++){
            treeSet.add(rand.nextInt(11));
        }

        Iterator it = treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
