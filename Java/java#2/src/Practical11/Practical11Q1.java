package Practical11;

import java.util.Random;

import javax.swing.text.Style;
public class Practical11Q1 {
    public static void main(String[] args){
        int [] arr = genRandArr(20,0,100);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
        /*for(int number : arr){
            System.out.print(number+" ");
        }*/
    }

    public static int[] genRandArr(int size,int min, int max){
        int [] randArray = new int[size];

        Random rand = new Random();

        for(int i =0 ; i < size ; i++){
            randArray[i] = rand.nextInt(max - min) + min ;
        }

        return randArray;
    }
}
