package FreeTopic;
public class ChadGeneric1{
    public static void main(String[] args){

        Integer[] intArray ={1,2,3,4,5};
        Double[] doubleArray ={5.5, 4.4,3.3,2.2,1.1};
        Character[] charArray ={'H','E','F','C','I'};
        String[] stringArray = {"B","Y","E","F"};
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
        System.out.println(getFirst(intArray)); //get first in the Array
        System.out.println(getLast(intArray)); //get last in the Array
    }

    public static <T> void displayArray(T[] array){ //display the whole Array
        for(T x :array){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
    public static <T> T getFirst(T[] array){
        return array[0];
    }

    public static <T> T getLast(T[] array){
        return array[array.length-1];
    }
}